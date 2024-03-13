package com.example.DAWIl.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.DAWIl.Model.Category;
import com.example.DAWIl.Service.CategoryService;

@RestController
@RequestMapping("/category")
@CrossOrigin(origins = {"http://localhost:4200"})
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<Category>> list() {
        return new ResponseEntity<>(categoryService.list(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Category> add(@RequestBody Category c) {
        return new ResponseEntity<>(categoryService.add(c), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Category> update(@RequestBody Category c) {
        return new ResponseEntity<>(categoryService.update(c), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        categoryService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
