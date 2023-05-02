package Demo.MainDemo.ServiceImp;
import Demo.MainDemo.Models.UserRole;
import Demo.MainDemo.Repositories.UserRolerepos;
import Demo.MainDemo.Services.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserRoleServiceImp implements UserRoleService{
    @Autowired

    private UserRolerepos repository;
    public List<UserRole> listAllUserRoles(){
        return repository.findAll();
    }

}
