package dev.dustinb.CampApp.services.reservation;

import dev.dustinb.CampApp.entity.Reservation;

import java.util.List;

public interface ReservationService {

    public void save(Reservation theReservation);

    public List<Reservation> findAll();

    public Reservation findByGuestId(String theId);
}
