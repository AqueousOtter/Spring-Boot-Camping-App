package dev.dustinb.CampApp.dao;

import dev.dustinb.CampApp.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, Integer> {
    //no code needed due to JPA
}
