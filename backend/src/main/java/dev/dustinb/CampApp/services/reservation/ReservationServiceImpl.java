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
    final int[] CAMPSITES = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32};

    public ReservationServiceImpl(ReservationRepository theReservationRepository){
        reservationRepository = theReservationRepository;
    }

    @Override
    public void save(Reservation theReservation) {
        theReservation.setReservationId(ConfirmationGen.getConfirmationCode());
        reservationRepository.save(theReservation);
    }
    @Override
    public void delete(String reservationId){
        reservationRepository.delete(reservationRepository.getById(reservationId));
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
            throw new RuntimeException("No reservations for given reservation ID of " + reservationID);

        }
        return theReservation;
    }

    // method to display only open dates for reservations
    @Override
    public List<Reservation> openReservations(Date searchStartDate, Date searchEndDate) {
        List<Integer> openSites = new ArrayList<>();
        List<Reservation> openReservations = new ArrayList<>();
        //Grabs all reservations that conflict with searched date
        List<Integer> reservedDates = reservationRepository.findAllNotOpenDates(searchStartDate);
        //populate potential open sites
        for (int campsite : CAMPSITES) {
            openSites.add(campsite);
        }
        //check for matching dates, omit if already booked.
        if(!reservedDates.isEmpty()){
            for (Integer reservedDate : reservedDates) {
                openSites.remove(reservedDate);
            }
        }
        for (Integer openSite : openSites) {
            openReservations.add(new Reservation(openSite, searchStartDate, searchEndDate, 1005));
        }
        return openReservations;
    }
    //finds all reservations for a given guest id via query in ReservationRepository
    @Override
    public List<Reservation> findAllReservationsByGuestId(int guestId) {
        return reservationRepository.findAllForGuest(guestId);
    }

}
