package com.example.DAWIl.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.DAWIl.Model.Priority;

public interface PriorityRepo extends JpaRepository<Priority, Integer> {
    // Puedes agregar métodos específicos del repositorio si es necesario
}
