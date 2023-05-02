package Demo.MainDemo.ServiceImp;
import Demo.MainDemo.Models.Reservation;
import Demo.MainDemo.Repositories.Reservationrepos;

import Demo.MainDemo.Services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ReservationServiceImp implements ReservationService {
    @Autowired

    private Reservationrepos repository;
    public List<Reservation> listAllReservations(){
        return repository.findAll();
    }

}


