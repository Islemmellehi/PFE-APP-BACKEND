package Demo.MainDemo.ServiceImp;
import Demo.MainDemo.Models.Contrat;
import Demo.MainDemo.Repositories.Contratrepos;

import Demo.MainDemo.Services.ContratService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ContratServiceImp implements ContratService {
    @Autowired

    private Contratrepos Crepository;
    public List<Contrat> listAllContrats(){
        return Crepository.findAll();
    }
}
