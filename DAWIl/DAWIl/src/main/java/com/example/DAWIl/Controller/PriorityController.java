package com.example.DAWIl.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.DAWIl.Model.Priority;
import com.example.DAWIl.Service.PriorityService;

@RestController
@RequestMapping("/priority")
@CrossOrigin(origins = {"http://localhost:4200"})
public class PriorityController {

    @Autowired
    PriorityService priorityService;

    @GetMapping
    public ResponseEntity<List<Priority>> list() {
        return new ResponseEntity<>(priorityService.list(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Priority> add(@RequestBody Priority priority) {
        return new ResponseEntity<>(priorityService.add(priority), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Priority> update(@RequestBody Priority priority) {
        return new ResponseEntity<>(priorityService.update(priority), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        priorityService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
