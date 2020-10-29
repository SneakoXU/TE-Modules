package com.techelevator.reservations.controllers;

import com.techelevator.reservations.dao.HotelDAO;
import com.techelevator.reservations.dao.MemoryHotelDAO;
import com.techelevator.reservations.dao.MemoryReservationDAO;
import com.techelevator.reservations.dao.ReservationDAO;
import com.techelevator.reservations.models.Hotel;
import com.techelevator.reservations.models.Reservation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HotelController {

    private HotelDAO hotelDAO;
    private ReservationDAO reservationDAO;

    public HotelController() {
        this.hotelDAO = new MemoryHotelDAO();
        this.reservationDAO = new MemoryReservationDAO(hotelDAO);
    }

    /**
     * Return All Hotels
     *
     * @return a list of all hotels in the system
     */
    @RequestMapping(path = "/hotels", method = RequestMethod.GET)
    public List<Hotel> list() {
        return hotelDAO.list();
    }

    /**
     * Return hotel information
     *
     * @param id the id of the hotel
     * @return all info for a given hotel
     */
    @RequestMapping(path = "/hotels/{id}", method = RequestMethod.GET)
    public Hotel get(@PathVariable int id) {
        return hotelDAO.get(id);
    }
    
    //List all reservations
    
    @RequestMapping(path = "/reservations", method = RequestMethod.GET)
    public List<Reservation> listReservations(){
    	return reservationDAO.findAll();
    }
    
    //Get a reservation by the ID value
    
    @RequestMapping(path = "/reservations/{id}", method = RequestMethod.GET)
    public Reservation getReservation(@PathVariable int id) {
    	
    	//Reservation result = ;
    	return reservationDAO.get(id);
    }
    
    //Get a reservation by hotelID
    
    @RequestMapping(path="/hotels/{hotelID}/reservations", method = RequestMethod.GET)
    public List<Reservation> getReservationsByHotel(@PathVariable int hotelID){
    	
    	List<Reservation> result = null;
    	
    	result = reservationDAO.findByHotel(hotelID);
    	
    	return result;
    }
    
    //Create a new reservation
    
    @RequestMapping(path="/hotels/{hotelID}/reservations", method = RequestMethod.POST)
    public Reservation addNewReservation(@RequestBody Reservation newReservation, @PathVariable(required = false) int hotelID) {
    	
    	Reservation result = null;
    	result = reservationDAO.create(newReservation, hotelID);
    	return result;
    	
    }
    
    //Filtered list of hotels
    
    @RequestMapping(path="/filter", method = RequestMethod.GET)
    public List<Hotel> filterByCityandState(@RequestParam String state, @RequestParam String city){
    	List<Hotel> filteredResult = new ArrayList<>();
    	List<Hotel> hotels = hotelDAO.list();
    	
    	for(Hotel hotel : hotels) {
    		
    		//if a city is specified, ignore the state
    		if(city != null) {
    			if(hotel.getAddress().getCity().toUpperCase().equals(city.toUpperCase())) {
        			filteredResult.add(hotel);
        		}
    		}else {
    		
    		//if no city specified, then filter by state
    		if(hotel.getAddress().getState().toUpperCase().equals(state.toUpperCase())) {
    			filteredResult.add(hotel);
    			}
    		}
    	}
    	
    	
    	return filteredResult;
    }
    
    @RequestMapping(path="/reservations/{resID}", method = RequestMethod.DELETE)
    public void deleteReservation(@PathVariable int resID) {
    	//CALL RESERVATION DAO 
    	reservationDAO.delete(resID);
    	
    }
    
    

}
