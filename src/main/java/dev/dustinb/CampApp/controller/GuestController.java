package dev.dustinb.CampApp.controller;


import dev.dustinb.CampApp.entity.Guest;
import dev.dustinb.CampApp.services.guest.GuestService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/account/{guestId}")
    public String showAccountInfo(@PathVariable("guestId") int guestId, Model theModel){
        Guest theGuest = guestService.findById(guestId);
        theModel.addAttribute("guest", theGuest);
        theModel.addAttribute("guestId",guestId);
        theModel.addAttribute("firstName" , theGuest.getFirstName());
        theModel.addAttribute("lastName", theGuest.getLastName());
        theModel.addAttribute("email", theGuest.getEmail());
        theModel.addAttribute("phone", theGuest.getPhone());

        return "/view";
    }

}
