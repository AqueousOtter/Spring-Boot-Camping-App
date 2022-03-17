package dev.dustinb.CampApp.rest;


import dev.dustinb.CampApp.entity.Guest;
import dev.dustinb.CampApp.services.guest.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/*
        Class currently TEST only, supports get request of all guests or single guest
 */

@RestController
@RequestMapping("/api")
public class RestGuestController {

    private GuestService guestService;

    @Autowired
    public RestGuestController(GuestService theGuestService){
        guestService = theGuestService;
    }

    // return all guests in db
    @GetMapping("/list")
    public List<Guest> findAll(){
      return guestService.findAll();
    }

    //grab guest by id
    @GetMapping("/guest/{guestId}")
    public Guest findGuestById(@PathVariable int guestId){
        return guestService.findById(guestId);
    }

}
