package com.example.DAWIl.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DAWIl.Model.Priority;
import com.example.DAWIl.Repo.PriorityRepo;
import com.example.DAWIl.Service.PriorityService;

@Service
public class PriorityServiceImpl implements PriorityService {

    @Autowired
    PriorityRepo priorityRepo;
    
	@Override
	public List<Priority> list() {
		// TODO Auto-generated method stub
        return priorityRepo.findAll();
	}

	@Override
	public Priority add(Priority priority) {
		// TODO Auto-generated method stub
        return priorityRepo.save(priority);
	}

	@Override
	public Priority update(Priority priority) {
		// TODO Auto-generated method stub
        return priorityRepo.save(priority);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
        priorityRepo.deleteById(id);

	}

	
	
}