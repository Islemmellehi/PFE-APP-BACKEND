package Demo.MainDemo.Controllers;

import Demo.MainDemo.Models.Message;
import Demo.MainDemo.Models.Reservation;
import Demo.MainDemo.Repositories.Messagerepos;
import Demo.MainDemo.ServiceImp.MessageServiceImp;
import Demo.MainDemo.Services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.beans.XMLDecoder;
import java.util.List;
import java.util.Map;
import java.util.UUID;


@RestController
public class MessageController {
    @Autowired
    private Messagerepos MessageRepos;
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private MessageServiceImp Cservice;


    @CrossOrigin
    @GetMapping("/messages")
    public List<Map<String, Object>> getAllMessages() {
        return jdbcTemplate.queryForList("SELECT * FROM MESSAGE");
    }

    @CrossOrigin
    @PostMapping("/sendmessages")
    public ResponseEntity<Message> add(@RequestBody Message message) {
        Message msg = Cservice.createMessage(message);
        return new ResponseEntity<>(msg, HttpStatus.CREATED);
    }

    @CrossOrigin

    @PostMapping("/createmsg")
    public ResponseEntity<Message> createMessage(@RequestBody Message message) {
        message.setCod_message( UUID.randomUUID().toString());
        Message createdMessage = Cservice.createMessage(message);
        return ResponseEntity.ok(createdMessage);
    }
    @CrossOrigin
    @DeleteMapping("/deletemsg/{id}")
    public void deleteMessage(@PathVariable String id) {
        Cservice.deleteMessage(id);
    }



}