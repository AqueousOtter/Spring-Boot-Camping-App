package dev.dustinb.CampApp.repositories;

import dev.dustinb.CampApp.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReservationRepository  extends JpaRepository<Reservation, String> {
    @Query("SELECT reservations FROM Reservation reservations WHERE reservations.guestID = :guestReservation")
    public List<Reservation> findAllForGuest(@Param("guestReservation")int guestReservation);
}
