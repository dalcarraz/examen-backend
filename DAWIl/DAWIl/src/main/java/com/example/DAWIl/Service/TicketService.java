package com.example.DAWIl.Service;

import java.util.List;

import com.example.DAWIl.Model.Ticket;

public interface TicketService {
    public List<Ticket> list();
    public Ticket add(Ticket t);
    public Ticket update(Ticket t);
    public void delete(int id);
}
