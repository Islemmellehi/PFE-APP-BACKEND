package Demo.MainDemo.Controllers;

import Demo.MainDemo.Repositories.Contratrepos;
import Demo.MainDemo.Repositories.Pensionrepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;


@RestController
public class ContratController {
    @Autowired
    private Contratrepos ContratRepos;
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @CrossOrigin
    @GetMapping("/contrats")
    public List<Map<String, Object>> getAllContrats() {
        return jdbcTemplate.queryForList("SELECT * FROM CONTRAT");
    }

}
