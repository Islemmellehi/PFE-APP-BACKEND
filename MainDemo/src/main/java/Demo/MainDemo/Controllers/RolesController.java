package Demo.MainDemo.Controllers;
import Demo.MainDemo.Repositories.Pensionrepos;
import Demo.MainDemo.Repositories.Societerepos;
import Demo.MainDemo.Repositories.Rolerepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
public class RolesController {
    @Autowired
    private Rolerepos Rolesrepos;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @CrossOrigin
    @GetMapping("/roles")
    public List<Map<String, Object>> getAllRoles() {
        List<Map<String, Object>> R = jdbcTemplate.queryForList("SELECT * FROM ROLES");
        return R;
    }


}
