package com.example.DAWIl.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DAWIl.Model.Project;
import com.example.DAWIl.Repo.ProjectRepo;
import com.example.DAWIl.Service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    ProjectRepo projectRepo;
    
	@Override
	public List<Project> list() {
		// TODO Auto-generated method stub
        return projectRepo.findAll();
	}

	@Override
	public Project add(Project p) {
		// TODO Auto-generated method stub
        return projectRepo.save(p);
	}

	@Override
	public Project update(Project p) {
		// TODO Auto-generated method stub
        return projectRepo.save(p);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
        projectRepo.deleteById(id);

	}
}