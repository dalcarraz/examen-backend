package com.example.DAWIl.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.DAWIl.Model.Kind;

public interface KindRepo extends JpaRepository<Kind, Integer> {
    // Puedes agregar métodos específicos del repositorio si es necesario
}
