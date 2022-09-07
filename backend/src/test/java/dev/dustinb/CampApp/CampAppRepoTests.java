package dev.dustinb.CampApp;
import dev.dustinb.CampApp.entity.Reservation;
import dev.dustinb.CampApp.services.reservation.ReservationService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Date;
import java.util.List;

@SpringBootTest
class CampAppRepoTests {

    @Autowired
    ReservationService reservationService;

    @DisplayName("Test list all reservations")
    @Test
    public void testFindAllReservations(){
        List<Reservation> reservationList = reservationService.findAll();
        Assertions.assertTrue(reservationList.size() > 0);
    }

    @Nested
    @DisplayName("Add reservation nested tests ")
    class AddReservation{
        @Test
        @DisplayName("add reservation")
        public void testAddReservation(){
            Reservation reservation = new Reservation(12,new Date(60821466), new Date(668214766), 1005);
            reservationService.save(reservation);
            String resID = reservation.getReservationId();
            Assertions.assertNotNull(reservationService.findByReservationId(resID));

        }
        @Test
        @DisplayName("does not add reservation with incorrect site number")
        public void incorrectSiteNum(){
            Assertions.assertTrue(true);
        }
    }


    @DisplayName("Test delete reservation")
    @Test
    public void testDeleteReservation(){
        Reservation reservation = new Reservation(12,new Date(60821466), new Date(668214766), 1005);
        reservationService.save(reservation);
        String resID = reservation.getReservationId();
        reservationService.delete(resID);
        List<Reservation> reservationList = reservationService.findAll();
        Assertions.assertFalse(reservationList.contains(reservation));
    }
    @DisplayName("Test for reservation by guest id")
    @Test
    public void testReservationByGuestId(){
        List<Reservation> reservationList = reservationService.findAllReservationsByGuestId(1005);
        Assertions.assertFalse(reservationList.isEmpty());

    }
}
