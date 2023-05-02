package Demo.MainDemo.Controllers;
import Demo.MainDemo.Repositories.Pensionrepos;
import Demo.MainDemo.Repositories.Societerepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
public class SocieteController {
    @Autowired
    private Societerepos SocieteRepos;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @CrossOrigin
    @GetMapping("/societes")
    public List<Map<String, Object>> getAllSociete() {
        List<Map<String, Object>> societes = jdbcTemplate.queryForList("SELECT * FROM SOCIETE");
        return societes;
    }


}
