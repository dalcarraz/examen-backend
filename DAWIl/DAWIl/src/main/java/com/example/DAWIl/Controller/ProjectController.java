package com.example.DAWIl.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.DAWIl.Model.Project;
import com.example.DAWIl.Service.ProjectService;

@RestController
@RequestMapping("/project")
@CrossOrigin(origins = {"http://localhost:4200"})
public class ProjectController {

    @Autowired
    ProjectService projectService;

    @GetMapping
    public ResponseEntity<List<Project>> list() {
        return new ResponseEntity<>(projectService.list(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Project> add(@RequestBody Project project) {
        return new ResponseEntity<>(projectService.add(project), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Project> update(@RequestBody Project project) {
        return new ResponseEntity<>(projectService.update(project), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        projectService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
