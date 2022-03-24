package dev.dustinb.CampApp.controller;


import dev.dustinb.CampApp.entity.Reservation;
import dev.dustinb.CampApp.services.reservation.ReservationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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

        return "/reservation";
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
        return "/viewReservation";
    }

    //Displays all reservations
    @GetMapping("/showAll")
    public String showAllReservations(Model theModel){
        List<Reservation> allReservations = null;
        allReservations = reservationService.findAll();
        theModel.addAttribute("reservations",allReservations);
        return "/allReservations";
    }
}
