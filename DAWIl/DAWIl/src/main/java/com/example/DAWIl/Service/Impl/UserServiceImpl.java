package com.example.DAWIl.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.DAWIl.Model.Category;
import com.example.DAWIl.Model.User;
import com.example.DAWIl.Repo.UserRepo;
import com.example.DAWIl.Service.UserService;

import java.util.List;


	@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;
    
    
	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
        return userRepo.findAll();
	}

	@Override
	public User add(User user) {
		// TODO Auto-generated method stub
        return userRepo.save(user);
	}

	@Override
	public User update(User user) {
		// TODO Auto-generated method stub
        return userRepo.save(user);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
        userRepo.deleteById(id);
	}
	
	

	
}   