package com.example.DAWIl.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.DAWIl.Model.Project;

public interface ProjectRepo extends JpaRepository<Project, Integer> {
    // Puedes agregar métodos específicos del repositorio si es necesario
}
