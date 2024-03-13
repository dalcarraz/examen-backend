package com.example.DAWIl.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.DAWIl.Model.Status;
import com.example.DAWIl.Service.StatusService;

@RestController
@RequestMapping("/status")
@CrossOrigin(origins = {"http://localhost:4200"})
public class StatusController {

    @Autowired
    StatusService statusService;

    @GetMapping
    public ResponseEntity<List<Status>> list() {
        return new ResponseEntity<>(statusService.list(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Status> add(@RequestBody Status status) {
        return new ResponseEntity<>(statusService.add(status), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Status> update(@RequestBody Status status) {
        return new ResponseEntity<>(statusService.update(status), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        statusService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
