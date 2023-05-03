package Demo.MainDemo.Controllers;


import Demo.MainDemo.Repositories.ContratPrixrepos;
import Demo.MainDemo.Repositories.Contratrepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;


@RestController
public class ContratPrixController {
    @Autowired
    private ContratPrixrepos ContratPrixRepos;
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @CrossOrigin
    @GetMapping("/contratprix")
    public List<Map<String, Object>> getAllContratPrix() {
        return jdbcTemplate.queryForList("SELECT * FROM CONTRAT_PRIX");
    }

}
