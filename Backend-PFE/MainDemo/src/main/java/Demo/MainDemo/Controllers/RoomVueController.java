package Demo.MainDemo.Controllers;
import Demo.MainDemo.Models.RoomVue;
import Demo.MainDemo.Repositories.RoomVuerepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.List;
import java.util.Map;
import java.util.Optional;


@RestController
public class RoomVueController {
    @Autowired
    private RoomVuerepos repos;
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @CrossOrigin
    @GetMapping("/roomvues")

    public List<Map<String, Object>> getAllRoomVues() {
        List<Map<String, Object>> vues = jdbcTemplate.queryForList("SELECT * FROM ROOM_VUE");
        return vues;
    }

}
