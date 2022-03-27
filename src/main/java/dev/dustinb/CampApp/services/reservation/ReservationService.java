package dev.dustinb.CampApp.services.reservation;

import dev.dustinb.CampApp.entity.Reservation;

import java.sql.Date;
import java.util.List;

public interface ReservationService {

    public void save(Reservation theReservation);
    public List<Reservation> findAll();
    public Reservation findByReservationId(String theId);
    List<Integer> openReservations(Date searchStartDate);
    List<Reservation> findAllReservationsByGuestId(int guestId);
}
