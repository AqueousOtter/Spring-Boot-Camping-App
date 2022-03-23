package dev.dustinb.CampApp.repositories;

import dev.dustinb.CampApp.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

// refactor repos ***


public interface ReservationRepository  extends JpaRepository<Reservation, String> {
}
