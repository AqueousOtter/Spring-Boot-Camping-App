package dev.dustinb.CampApp.services.reservation;

import dev.dustinb.CampApp.repositories.ReservationRepository;
import dev.dustinb.CampApp.entity.Reservation;
import dev.dustinb.CampApp.utilities.ConfirmationGen;
import org.springframework.stereotype.Service;

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

    @Override
    public Reservation findByGuestId(String reservationID) {
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

    //method to find reservation by reservation code/id

    // method to find reservation by guest id





}
