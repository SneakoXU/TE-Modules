package com.techelevator.dao.jdbc;

import com.techelevator.dao.ReservationDAO;
import com.techelevator.model.Reservation;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class JDBCReservationDAOTests extends BaseDAOTests {

    private ReservationDAO dao;

    @Before
    public void setup() {
        dao = new JDBCReservationDAO(dataSource);
        //String sqlInsertReservation = "INSERT INTO reservation (site_id, name, from_date, to_date) VALUES  ( "
    }

    @Test
    public void createReservation_Should_ReturnNewReservationId() {
        int reservationCreated = dao.createReservation(1,
                "TEST NAME",
                LocalDate.now().plusDays(1),
                LocalDate.now().plusDays(3));
       Reservation test = new Reservation();
       test.setReservationId(reservationCreated);

        assertEquals(reservationCreated, test.getReservationId());
     
    }

}
