package dev.dustinb.CampApp.controller;


import dev.dustinb.CampApp.entity.Guest;
import dev.dustinb.CampApp.services.guest.GuestService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/*
    Controller to register new guest, update guest info
 */

@Controller
@RequestMapping("/guests")
public class GuestController {

    GuestService guestService;

    public GuestController(GuestService theGuestService){
        guestService = theGuestService;
    }

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

}
