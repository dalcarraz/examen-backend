package com.example.DAWIl.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.DAWIl.Model.Ticket;
import com.example.DAWIl.Service.TicketService;

@RestController
@RequestMapping("/ticket")
@CrossOrigin(origins = {"http://localhost:4200"})
public class TicketController {

    @Autowired
    TicketService ticketService;

    @GetMapping
    public ResponseEntity<List<Ticket>> list() {
        return new ResponseEntity<>(ticketService.list(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Ticket> add(@RequestBody Ticket t) {
        return new ResponseEntity<>(ticketService.add(t), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Ticket> update(@RequestBody Ticket t) {
        return new ResponseEntity<>(ticketService.update(t), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        ticketService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
