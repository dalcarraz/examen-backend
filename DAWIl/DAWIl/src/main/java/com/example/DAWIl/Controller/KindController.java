package com.example.DAWIl.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.DAWIl.Model.Kind;
import com.example.DAWIl.Service.KindService;

@RestController
@RequestMapping("/kind")
@CrossOrigin(origins = {"http://localhost:4200"})
public class KindController {

    @Autowired
    KindService kindService;

    @GetMapping
    public ResponseEntity<List<Kind>> list() {
        return new ResponseEntity<>(kindService.list(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Kind> add(@RequestBody Kind kind) {
        return new ResponseEntity<>(kindService.add(kind), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Kind> update(@RequestBody Kind kind) {
        return new ResponseEntity<>(kindService.update(kind), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        kindService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
