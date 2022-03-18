package dev.dustinb.CampApp.controller;



import dev.dustinb.CampApp.entity.Reservation;
import dev.dustinb.CampApp.services.reservation.ReservationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reservation")
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



}
