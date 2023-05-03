package Demo.MainDemo.ServiceImp;
import Demo.MainDemo.Models.RoomVue;
import Demo.MainDemo.Repositories.RoomVuerepos;
import Demo.MainDemo.Services.RoomVueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional

public class RoomVueServiceImp implements RoomVueService{
    @Autowired
    private RoomVuerepos repos;
    public List<RoomVue> listAllRoomVues(){
        return repos.findAll();
    }

}
