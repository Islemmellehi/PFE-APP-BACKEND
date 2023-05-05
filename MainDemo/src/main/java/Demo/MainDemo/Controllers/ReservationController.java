package Demo.MainDemo.Controllers;
import Demo.MainDemo.Models.Reservation;
import Demo.MainDemo.Repositories.Pensionrepos;
import Demo.MainDemo.Repositories.Reservationrepos;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Map;

@RestController
public class ReservationController {
    @Autowired
    private Reservationrepos ReservationRepos;
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @CrossOrigin
    @GetMapping("/reservations")
    public List<Map<String, Object>> getAllReservations() {
        List<Map<String, Object>> reservations = jdbcTemplate.queryForList("SELECT * FROM RESERVATION");
        return reservations;
    }



}
