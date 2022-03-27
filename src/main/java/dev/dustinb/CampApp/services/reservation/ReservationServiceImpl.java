package dev.dustinb.CampApp.services.reservation;

import dev.dustinb.CampApp.repositories.ReservationRepository;
import dev.dustinb.CampApp.entity.Reservation;
import dev.dustinb.CampApp.utilities.ConfirmationGen;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ReservationServiceImpl implements ReservationService{

    ReservationRepository reservationRepository;
    //array to hold NorthLake Site Numbers
    final int[] CAMPSITES = {12,13,14,25,11,1};

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

    @Override
    public List<Integer> openReservations(Date searchStartDate) {
        List<Integer> openSites = new ArrayList<>();
        List<Integer> reservedDates = reservationRepository.findAllNotOpenDates(searchStartDate);
        System.out.println(reservedDates.toString());
        if(reservedDates.isEmpty()){
            for(int i = 0; i < CAMPSITES.length; i++){
                openSites.add(CAMPSITES[i]);
            }
        }
        else {
            for (int i = 0; i < reservedDates.size(); i++) {
                if (CAMPSITES[i] != reservedDates.get(i)) {
                    openSites.add(CAMPSITES[i]);
                }
            }
        }
        return openSites;
    }



    //finds all reservations for a given guest id via query in ReservationRepository
    @Override
    public List<Reservation> findAllReservationsByGuestId(int guestId) {
        return reservationRepository.findAllForGuest(guestId);
    }

}
