package Demo.MainDemo.ServiceImp;

import Demo.MainDemo.Models.ContratPrix;
import Demo.MainDemo.Repositories.ContratPrixrepos;

import Demo.MainDemo.Services.ContratPrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ContratPrixServiceImp implements ContratPrixService {
    @Autowired

    private ContratPrixrepos Crepository;
    public List<ContratPrix> listAllContratPrix(){
        return Crepository.findAll();
    }


}
