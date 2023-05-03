package Demo.MainDemo.Controllers;
import Demo.MainDemo.Repositories.Pensionrepos;
import Demo.MainDemo.Repositories.Societerepos;
import Demo.MainDemo.Repositories.UserRolerepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
public class UserRoleController {
    @Autowired
    private UserRolerepos UserRoleRepos;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @CrossOrigin
    @GetMapping("/userroles")
    public List<Map<String, Object>> getAllUserRoles() {
        List<Map<String, Object>> userroles = jdbcTemplate.queryForList("SELECT * FROM USER_ROLE");
        return userroles;
    }


}
