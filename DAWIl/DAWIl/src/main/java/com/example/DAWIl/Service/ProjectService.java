package com.example.DAWIl.Service;

import java.util.List;

import com.example.DAWIl.Model.Project;

public interface ProjectService {
    public List<Project> list();
    public Project add(Project p);
    public Project update(Project p);
    public void delete(int id);
}
