package com.example.DAWIl.Service;

import java.util.List;

import com.example.DAWIl.Model.Status;

public interface StatusService {
    public List<Status> list();
    public Status add(Status status);
    public Status update(Status status);
    public void delete(int id);
}
