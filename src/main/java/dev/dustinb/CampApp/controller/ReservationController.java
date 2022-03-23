package dev.dustinb.CampApp.controller;


import dev.dustinb.CampApp.entity.Reservation;
import dev.dustinb.CampApp.services.reservation.ReservationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/save")
    public String saveReservation(@ModelAttribute("reservation") Reservation theReservation){
        reservationService.save(theReservation);
        return "redirect:/";
    }

    //Simplify code for single reservation
    @GetMapping("/view/{reservationID}")
    public String viewReservationById(@PathVariable("reservationID")String reservationID, Model theModel){

        Reservation theReservation = reservationService.findByGuestId(reservationID);
        theModel.addAttribute("reservationID", theReservation.getReservationId());
        theModel.addAttribute("site", theReservation.getSiteNumber());
        theModel.addAttribute("arrivalDate", theReservation.getStartDate());
        theModel.addAttribute("departureDate", theReservation.getEndDate());
        theModel.addAttribute("guestID", theReservation.getGuestID());
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
