package Demo.MainDemo.ServiceImp;

import Demo.MainDemo.Models.Pension;
import Demo.MainDemo.Repositories.Pensionrepos;

import Demo.MainDemo.Services.PensionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PensionServiceImp implements PensionService{
    @Autowired

    private Pensionrepos repository;
    public List<Pension> listAllPensions(){
        return repository.findAll();
    }
}
