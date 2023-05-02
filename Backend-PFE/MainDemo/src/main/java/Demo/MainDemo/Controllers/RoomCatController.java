package Demo.MainDemo.Controllers;
import Demo.MainDemo.Repositories.RoomCatrepos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;



@RestController
public class RoomCatController {
    @Autowired
    private RoomCatrepos RoomCatRepos ;
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @CrossOrigin
    @GetMapping("/roomcats")
    public List<Map<String, Object>> getAllRoomCats() {
        List<Map<String, Object>> roomcats = jdbcTemplate.queryForList("SELECT * FROM ROOM_CATEGORIE");
        return roomcats;
    }
}
