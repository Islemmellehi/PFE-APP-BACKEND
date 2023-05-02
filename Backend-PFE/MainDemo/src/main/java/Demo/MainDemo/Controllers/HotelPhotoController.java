package Demo.MainDemo.Controllers;

import Demo.MainDemo.Models.HotelPhoto;
import Demo.MainDemo.Repositories.HotelPhotorepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController

public class HotelPhotoController {
    @Autowired
    private HotelPhotorepos HotelPhotorepos;
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @CrossOrigin
    @GetMapping("/hotelphotos")
    public List<Map<String, Object>> getAllHotelPhotos() {
        List<Map<String, Object>> hotelphotos = jdbcTemplate.queryForList("SELECT * FROM HOTEL_PHOTO");
        return hotelphotos;
    }
}

