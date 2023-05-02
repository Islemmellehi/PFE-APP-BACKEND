package Demo.MainDemo.Controllers;
import Demo.MainDemo.Models.Pension;
import Demo.MainDemo.Repositories.Pensionrepos;
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
public class PensionController {
    @Autowired
    private Pensionrepos PensionRepos;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @CrossOrigin
    @GetMapping("/pensions")
    public List<Map<String, Object>> getAllPensions() {
        List<Map<String, Object>> pensions = jdbcTemplate.queryForList("SELECT * FROM PENSION");
        return pensions;
    }


}



