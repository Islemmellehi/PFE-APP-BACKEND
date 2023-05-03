package Demo.MainDemo.Controllers;

import Demo.MainDemo.Repositories.Hotelrepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;


@RestController
public class HotelController {
    @Autowired
    private Hotelrepos HotelRepos;
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @CrossOrigin
    @GetMapping("/hotels")
    public List<Map<String, Object>> getAllHotels() {
        return jdbcTemplate.queryForList("SELECT * FROM HOTEL");
    }

}
