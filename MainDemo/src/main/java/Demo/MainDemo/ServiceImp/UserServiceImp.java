package Demo.MainDemo.ServiceImp;
import Demo.MainDemo.Models.Users;
import Demo.MainDemo.Repositories.Userrepos;
import Demo.MainDemo.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImp implements UserService{
    @Autowired

    private Userrepos repository;
    public List<Users> listAllUsers(){
        return repository.findAll();
    }

}
