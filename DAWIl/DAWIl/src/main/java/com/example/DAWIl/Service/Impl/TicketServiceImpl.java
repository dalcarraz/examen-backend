package com.example.DAWIl.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DAWIl.Model.Ticket;
import com.example.DAWIl.Repo.TicketRepo;
import com.example.DAWIl.Service.TicketService;


@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	TicketRepo ticketRepo;
	
	@Override
	public List<Ticket> list() {
		// TODO Auto-generated method stub
        return ticketRepo.findAll();
	}

	@Override
	public Ticket add(Ticket t) {
		// TODO Auto-generated method stub
        return ticketRepo.save(t);
	}

	@Override
	public Ticket update(Ticket t) {
		// TODO Auto-generated method stub
        return ticketRepo.save(t);
	}

	@Override
	public void delete(int id) {
        ticketRepo.deleteById(id);
		
	}
	
}