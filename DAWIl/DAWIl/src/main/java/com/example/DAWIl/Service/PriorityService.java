package com.example.DAWIl.Service;

import java.util.List;

import com.example.DAWIl.Model.Priority;

public interface PriorityService {
    public List<Priority> list();
    public Priority add(Priority priority);
    public Priority update(Priority priority);
    public void delete(int id);
}
