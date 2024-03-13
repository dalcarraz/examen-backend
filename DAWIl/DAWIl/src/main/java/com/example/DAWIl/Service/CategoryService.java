package com.example.DAWIl.Service;

import java.util.List;

import com.example.DAWIl.Model.Category;

public interface CategoryService {
    public List<Category> list();
    public Category add(Category c);
    public Category update(Category c);
    public void delete(int id);
}
