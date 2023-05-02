package Demo.MainDemo.ServiceImp;
import Demo.MainDemo.Models.Roles;
import Demo.MainDemo.Repositories.Rolerepos;
import Demo.MainDemo.Services.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class RolesServiceImp implements RolesService{
    @Autowired

    private Rolerepos repository;
    public List<Roles> listAllRoles(){
        return repository.findAll();
    }

}
