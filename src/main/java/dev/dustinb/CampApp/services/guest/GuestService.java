package dev.dustinb.CampApp.services.guest;

import dev.dustinb.CampApp.entity.Guest;

import java.util.List;


public interface GuestService {

    public List<Guest> findAll();

    public Guest findById(int theId);

    public void save(Guest theGuest);

    public void deleteById(int theId);
}
