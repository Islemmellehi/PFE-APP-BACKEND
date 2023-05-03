package Demo.MainDemo.Controllers;

import Demo.MainDemo.Repositories.Messagerepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;


@RestController
public class MessageController {
    @Autowired
    private Messagerepos MessageRepos;
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @CrossOrigin
    @GetMapping("/messages")
    public List<Map<String, Object>> getAllMessages() {
        return jdbcTemplate.queryForList("SELECT * FROM MESSAGE");
    }

}
