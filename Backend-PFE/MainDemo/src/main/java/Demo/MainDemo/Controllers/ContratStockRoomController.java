package Demo.MainDemo.Controllers;
import Demo.MainDemo.Models.ContratStockRoom;
import Demo.MainDemo.Repositories.ContratStockRoomrepos;
import oracle.jdbc.pool.OracleDataSource;

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


@RequestMapping
@RestController

public class ContratStockRoomController {
    @Autowired
    private ContratStockRoomrepos repos;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @CrossOrigin
    @GetMapping("/stock")
    public List<Map<String,Object>> getAllStock(){
        List<Map<String,Object>> stock = jdbcTemplate.queryForList("SELECT * FROM CONTRAT_STOCK_ROOM");
                return stock;
    }
}
