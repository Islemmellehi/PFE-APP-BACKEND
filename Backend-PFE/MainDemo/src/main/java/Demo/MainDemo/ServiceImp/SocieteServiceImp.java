package Demo.MainDemo.ServiceImp;
import Demo.MainDemo.Models.Societe;
import Demo.MainDemo.Repositories.Societerepos;
import Demo.MainDemo.Services.SocieteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class SocieteServiceImp implements SocieteService{
    @Autowired

    private Societerepos repository;
    public List<Societe> listAllSociete(){
        return repository.findAll();
    }

}
