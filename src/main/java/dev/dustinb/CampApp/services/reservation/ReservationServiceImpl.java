package dev.dustinb.CampApp.services.reservation;

import dev.dustinb.CampApp.repositories.ReservationRepository;
import dev.dustinb.CampApp.entity.Reservation;
import dev.dustinb.CampApp.utilities.ConfirmationGen;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ReservationServiceImpl implements ReservationService{

    ReservationRepository reservationRepository;

    public ReservationServiceImpl(ReservationRepository theReservationRepository){
        reservationRepository = theReservationRepository;
    }

    @Override
    public void save(Reservation theReservation) {
        theReservation.setReservationId(ConfirmationGen.getConfirmationCode());
        reservationRepository.save(theReservation);
    }

    @Override
    public List<Reservation> findAll() {
        return reservationRepository.findAll();
    }

    //method to find reservation by reservation code/id
    @Override
    public Reservation findByReservationId(String reservationID) {
        Optional<Reservation> results = reservationRepository.findById(reservationID);

        Reservation theReservation = null;
        if(results.isPresent()){
            theReservation = results.get();
        }
        else{
            throw new RuntimeException("No reservations for given guest ID of " + reservationID);

        }
        return theReservation;
    }
    // method to find all reservations by a single guest id TODO: Refactor function
    @Override
    public List<Reservation> findByGuestId(int guestId){
        List<Reservation> reservations = reservationRepository.findAll();
        List<Reservation> guestReservations = new ArrayList<>();
        for (Reservation reservation : reservations) {
            if (reservation.getGuestID() == guestId) {
                guestReservations.add(reservation);
            }
        }
        return  guestReservations;
    }

}
