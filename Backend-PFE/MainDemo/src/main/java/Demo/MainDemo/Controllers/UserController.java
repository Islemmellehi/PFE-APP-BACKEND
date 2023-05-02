package Demo.MainDemo.Controllers;
import Demo.MainDemo.Repositories.Pensionrepos;
import Demo.MainDemo.Repositories.Societerepos;
import Demo.MainDemo.Repositories.Userrepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private Userrepos UserRepos;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @CrossOrigin
    @GetMapping("/users")
    public List<Map<String, Object>> getAllUsers() {
        List<Map<String, Object>> users = jdbcTemplate.queryForList("SELECT * FROM USERS");
        return users;
    }


}
