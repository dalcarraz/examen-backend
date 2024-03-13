package com.example.DAWIl.Repo;

import com.example.DAWIl.Model.Category;
import com.example.DAWIl.Model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Integer> {
    // Puedes agregar métodos específicos del repositorio si es necesario
}
