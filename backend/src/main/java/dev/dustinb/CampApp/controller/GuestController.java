package dev.dustinb.CampApp.controller;


import dev.dustinb.CampApp.entity.Guest;
import dev.dustinb.CampApp.entity.Reservation;
import dev.dustinb.CampApp.services.guest.GuestService;
import dev.dustinb.CampApp.services.reservation.ReservationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
    Controller to register new guest, update guest info
 */

@Controller
@RequestMapping("/guests")
public class GuestController {

    GuestService guestService;
    ReservationService reservationService;

    public GuestController(GuestService theGuestService, ReservationService theReservationService){
        reservationService = theReservationService;
        guestService = theGuestService;
    }

    //shows registration form for new guest account
    @GetMapping("/addNewGuest")
    public String addNewGuest(Model theModel){
        Guest theGuest = new Guest();
        theModel.addAttribute(theGuest);
        return "/register";
    }

    //save new guest
    @PostMapping("/save")
    public String saveGuest(@ModelAttribute("guest") Guest theGuest){
        guestService.save(theGuest);
        return "redirect:/";
    }

    //update guest by guestID
    @GetMapping("/account/{guestId}")
    public String showAccountInfo(@PathVariable("guestId") int guestId, Model theModel){
        Guest theGuest = guestService.findById(guestId);
        //check for reservations owned by the guest via id
        List<Reservation> guestReservations = reservationService.findAllReservationsByGuestId(guestId);
        theModel.addAttribute("reservations", guestReservations);
        theModel.addAttribute("guest", theGuest);

        return "account/userAccount";
    }



}
