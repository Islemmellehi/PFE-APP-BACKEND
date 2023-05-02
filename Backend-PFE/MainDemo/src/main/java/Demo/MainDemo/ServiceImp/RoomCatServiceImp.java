package Demo.MainDemo.ServiceImp;

import Demo.MainDemo.Models.Pension;
import Demo.MainDemo.Models.RoomCategory;
import Demo.MainDemo.Repositories.Pensionrepos;
import Demo.MainDemo.Repositories.RoomCatrepos;
import Demo.MainDemo.Services.RoomCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class RoomCatServiceImp implements RoomCatService{
    @Autowired
    private RoomCatrepos repository;
    public List<RoomCategory> listAllRoomCats(){
        return repository.findAll();
    }

}
