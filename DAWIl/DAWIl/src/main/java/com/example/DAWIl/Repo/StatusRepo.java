package com.example.DAWIl.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.DAWIl.Model.Status;

public interface StatusRepo extends JpaRepository<Status, Integer> {
    // Puedes agregar métodos específicos del repositorio si es necesario
}
