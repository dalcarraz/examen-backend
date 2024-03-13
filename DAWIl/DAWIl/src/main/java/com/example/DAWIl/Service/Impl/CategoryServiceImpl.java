package com.example.DAWIl.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DAWIl.Model.Category;
import com.example.DAWIl.Repo.CategoryRepo;
import com.example.DAWIl.Service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepo categoryRepo;
    
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
        return categoryRepo.findAll();
	}

	@Override
	public Category add(Category c) {
		// TODO Auto-generated method stub
        return categoryRepo.save(c);
	}

	@Override
	public Category update(Category c) {
		// TODO Auto-generated method stub
        return categoryRepo.save(c);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
        categoryRepo.deleteById(id);

	}
	
	
	
}