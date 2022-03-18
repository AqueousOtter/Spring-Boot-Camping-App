package dev.dustinb.CampApp.services.reservation;

import dev.dustinb.CampApp.dao.ReservationRepository;
import dev.dustinb.CampApp.entity.Reservation;
import dev.dustinb.CampApp.utilities.ConfirmationGen;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements ReservationService{

    ReservationRepository reservationRepository;

    public ReservationServiceImpl(ReservationRepository theReservationRepository){
        reservationRepository = theReservationRepository;
    }

    @Override
    public void save(Reservation theReservation) {
        theReservation.setReservationCode(ConfirmationGen.getConfirmationCode());
        reservationRepository.save(theReservation);
    }
}
