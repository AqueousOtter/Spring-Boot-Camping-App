package dev.dustinb.CampApp.services.guest;


import dev.dustinb.CampApp.repositories.GuestRepository;
import dev.dustinb.CampApp.entity.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GuestServiceImpl implements GuestService {

    GuestRepository guestRepository;

    @Autowired
    public GuestServiceImpl(GuestRepository theGuestRepository){
        guestRepository = theGuestRepository;
    }

    @Override
    public List<Guest> findAll() {
        return guestRepository.findAll();
    }

    @Override
    public Guest findById(int theId) {
        //check for null
        Optional<Guest> result = guestRepository.findById(theId);

        Guest theGuest = null;
        if(result.isPresent()){
            theGuest = result.get();
        }
        else{
            throw new RuntimeException("Error - guest id of: " + theId + "not found");
        }

        return theGuest;
    }

    @Override
    public void save(Guest theGuest) {
        guestRepository.save(theGuest);
    }

    @Override
    public void deleteById(int theId) {
        guestRepository.deleteById(theId);
    }
}
