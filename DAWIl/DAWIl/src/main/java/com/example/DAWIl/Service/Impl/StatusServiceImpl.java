package com.example.DAWIl.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DAWIl.Model.Status;
import com.example.DAWIl.Repo.StatusRepo;
import com.example.DAWIl.Service.StatusService;

@Service
public class StatusServiceImpl implements StatusService {

    @Autowired
    StatusRepo statusRepo;
    
	@Override
	public List<Status> list() {
		// TODO Auto-generated method stub
        return statusRepo.findAll();
	}

	@Override
	public Status add(Status status) {
		// TODO Auto-generated method stub
        return statusRepo.save(status);
	}

	@Override
	public Status update(Status status) {
		// TODO Auto-generated method stub
        return statusRepo.save(status);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
        statusRepo.deleteById(id);

	}
	
}