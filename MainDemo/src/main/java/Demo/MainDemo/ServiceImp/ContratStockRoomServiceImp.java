package Demo.MainDemo.ServiceImp;
import Demo.MainDemo.Models.ContratStockRoom;
import Demo.MainDemo.Repositories.ContratStockRoomrepos;

import Demo.MainDemo.Services.ContratStockRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional

public class ContratStockRoomServiceImp implements ContratStockRoomService {
    @Autowired
    private ContratStockRoomrepos repos;
    public List<ContratStockRoom> listAllStock(){
        return repos.findAll();
    }

}
