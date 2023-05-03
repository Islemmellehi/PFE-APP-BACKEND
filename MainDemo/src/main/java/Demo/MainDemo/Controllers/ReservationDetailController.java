package Demo.MainDemo.Controllers;
import Demo.MainDemo.Models.ReservationDetail;
import Demo.MainDemo.Repositories.Pensionrepos;
import Demo.MainDemo.Repositories.ReservationDetailrepos;


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

public class ReservationDetailController {
    @Autowired
    private ReservationDetailrepos ReservationDetailRepos;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @CrossOrigin
    @GetMapping("/resdetails")
    public List<Map<String, Object>> getAllReservationDetails() {
        List<Map<String, Object>> res = jdbcTemplate.queryForList("SELECT * FROM RESERVATION_DETAIL");
        return res;
    }
}
