package dev.dustinb.CampApp.controller;


import dev.dustinb.CampApp.entity.Reservation;
import dev.dustinb.CampApp.services.reservation.ReservationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@Controller
@RequestMapping("/reservations")
public class ReservationController {

    ReservationService reservationService;

    public ReservationController(ReservationService theReservationService){
        reservationService = theReservationService;
    }

    @GetMapping("/addReservation")
    public String addReservation(Model theModel){
        Reservation theReservation = new Reservation();

        theModel.addAttribute(theReservation);
        return "/reservations/reservation";
    }

    // saves reservation into the reservation database
    @PostMapping("/save")
    public String saveReservation(@ModelAttribute("reservation") Reservation theReservation){
        reservationService.save(theReservation);
        return "redirect:/";
    }

    //view a reservation by the reservation ID code
    @GetMapping("/view/{reservationID}")
    public String viewReservationById(@PathVariable("reservationID")String reservationID, Model theModel){
        Reservation theReservation = reservationService.findByReservationId(reservationID);

        theModel.addAttribute("reservation", theReservation);
        return "/reservations/viewReservation";
    }

    //Displays all reservations
    @GetMapping("/showAll")
    public String showAllReservations(Model theModel){
        List<Reservation> allReservations = null;
        allReservations = reservationService.findAll();
        theModel.addAttribute("reservations",allReservations);
        return "/reservations/allReservations";
    }

    @GetMapping("/openDates")
    public String searchDates(){
        return "/reservations/searchReservations";
    }
    @GetMapping("/showAllOpenDates")
    public String showAllOpenDates(@ModelAttribute("searchDate") Date searchDate,Date searchEndDate, Model theModel){
        theModel.addAttribute("searchDate", searchDate);
        List<Reservation> openDates = reservationService.openReservations(searchDate, searchEndDate);
        theModel.addAttribute("openDates", openDates);
        theModel.addAttribute("searchEndDate", searchEndDate);
        return "/reservations/available";
    }
}
