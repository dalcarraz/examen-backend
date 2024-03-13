package com.example.DAWIl.Service;

import java.util.List;

import com.example.DAWIl.Model.Kind;

public interface KindService {
    public List<Kind> list();
    public Kind add(Kind k);
    public Kind update(Kind k);
    public void delete(int id);
}
