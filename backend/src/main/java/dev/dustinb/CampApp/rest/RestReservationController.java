package dev.dustinb.CampApp.rest;


import dev.dustinb.CampApp.entity.Reservation;
import dev.dustinb.CampApp.services.reservation.ReservationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/reservations")
public class RestReservationController {

    private ReservationService reservationService;

    public RestReservationController(ReservationService theReservationService){
        reservationService = theReservationService;
    }

    @GetMapping("/available/{startDate}/{endDate}")
    public List<Reservation> showOpenDates(@PathVariable Date startDate, @PathVariable Date endDate){
        return reservationService.openReservations(startDate, endDate);
    }


}
