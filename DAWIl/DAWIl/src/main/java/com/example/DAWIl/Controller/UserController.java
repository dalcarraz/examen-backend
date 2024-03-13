package com.example.DAWIl.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.DAWIl.Model.User;
import com.example.DAWIl.Service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = {"http://localhost:4200"})
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> list() {
        return new ResponseEntity<>(userService.list(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<User> add(@RequestBody User user) {
        return new ResponseEntity<>(userService.add(user), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<User> update(@RequestBody User user) {
        return new ResponseEntity<>(userService.update(user), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        userService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
