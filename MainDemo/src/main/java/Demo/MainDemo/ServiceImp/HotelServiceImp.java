package Demo.MainDemo.ServiceImp;
import Demo.MainDemo.Models.Hotel;
import Demo.MainDemo.Repositories.Hotelrepos;

import Demo.MainDemo.Services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class HotelServiceImp implements HotelService {
    @Autowired

    private Hotelrepos Crepository;
    public List<Hotel> listAllHotels(){
        return Crepository.findAll();
    }
}
