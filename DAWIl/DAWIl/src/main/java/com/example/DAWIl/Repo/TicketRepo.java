package com.example.DAWIl.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.DAWIl.Model.Ticket;

public interface TicketRepo extends JpaRepository<Ticket, Integer> {
    // Puedes agregar métodos específicos del repositorio si es necesario
}
