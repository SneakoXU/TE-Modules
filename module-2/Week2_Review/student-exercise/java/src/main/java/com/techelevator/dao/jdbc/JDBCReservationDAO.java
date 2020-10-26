package com.techelevator.dao.jdbc;

import com.techelevator.dao.ReservationDAO;
import com.techelevator.model.Park;
import com.techelevator.model.Reservation;
import com.techelevator.model.Site;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JDBCReservationDAO implements ReservationDAO {

    private JdbcTemplate jdbcTemplate;

    public JDBCReservationDAO(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public int createReservation(int siteId, String name, LocalDate fromDate, LocalDate toDate) {
           
          
          String sqlToCreateReservation = "INSERT INTO reservation (site_id, name, from_date, to_date) VALUES (?,?,?,?)";
          int confirmationID= jdbcTemplate.update(sqlToCreateReservation, siteId, name, fromDate, toDate);
//          SqlRowSet rows = jdbcTemplate.queryForRowSet("SELECT * FROM reservation WHERE site_id = ? AND name = ? AND from_date = ? AND to_date = ?", siteId, name, fromDate, toDate);
//
//           if(rows.next()) {
//        	  Reservation bookedReservation = mapRowToReservation(rows);
//        	  confirmationID = bookedReservation.getReservationId();
//          }
//          else {
//        	  confirmationID = 0;
//          }
    	
    	return confirmationID;
    }
    
//	public int getNextReservationId() {
//		SqlRowSet nextIdResult = jdbcTemplate.queryForRowSet("SELECT nextval('reservation_reservation_id_seq')");
//		if(nextIdResult.next()) {
//			return nextIdResult.getInt(1);
//		} else {
//			throw new RuntimeException("Something went wrong while getting an id for the new city");
//		}
//	}
	
	public List<Reservation> findUpcomingReservationsByParkId(Park parkId){
	
		List<Reservation> upcomingReservations = new ArrayList<>();
		String sqlForUpcomingReservations = "SELECT r.reservation_id, r.site_id, r.name, r.from_date AS start_date, r.to_date AS end_date, r.create_date \r\n" + 
				"FROM reservation r \r\n" + 
				"        JOIN site s ON r.site_id = s.site_id\r\n" + 
				"        JOIN campground c ON s.campground_id = c.campground_id\r\n" + 
				"        JOIN park p ON c.park_id = p.park_id\r\n" + 
				"WHERE r.from_date BETWEEN CURRENT_DATE AND CURRENT_DATE + INTERVAL '30 days' AND p.park_id = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlForUpcomingReservations, parkId);
		while(results.next()) {
			Reservation upcomingReservation = mapRowToReservation(results);
			upcomingReservations.add(upcomingReservation);
			
		}
		
		
		return upcomingReservations;
	}

    private Reservation mapRowToReservation(SqlRowSet results) {
        Reservation r = new Reservation();
        r.setReservationId(results.getInt("reservation_id"));
        r.setSiteId(results.getInt("site_id"));
        r.setName(results.getString("name"));
        r.setFromDate(results.getDate("from_date").toLocalDate());
        r.setToDate(results.getDate("to_date").toLocalDate());
        r.setCreateDate(results.getDate("create_date").toLocalDate());
        return r;
    }


}
