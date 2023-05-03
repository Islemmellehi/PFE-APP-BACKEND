package Demo.MainDemo.ServiceImp;
import Demo.MainDemo.Models.ReservationDetail;
import Demo.MainDemo.Repositories.ReservationDetailrepos;
import Demo.MainDemo.Services.ReservationDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ReservationDetailServiceImp implements ReservationDetailService {
    @Autowired

    private ReservationDetailrepos repository;
    public List<ReservationDetail> listAllReservationDetails(){
        return repository.findAll();
    }
}
