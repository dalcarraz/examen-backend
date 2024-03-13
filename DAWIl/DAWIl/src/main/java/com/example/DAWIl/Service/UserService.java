package com.example.DAWIl.Service;

import java.util.List;

import com.example.DAWIl.Model.User;

public interface UserService {
    public List<User> list();
    public User add(User user);
    public User update(User user);
    public void delete(int id);

    //@PersistenceContext
    //private EntityManager entityManager;

    //public List<User> getUsersByCategory(String categoryName) {
        //String jpql = "SELECT u FROM User u JOIN u.category c WHERE c.name = :categoryName";
        //Query query = entityManager.createQuery(jpql, User.class);
        //query.setParameter("categoryName", categoryName);
        //return query.getResultList()
    //}


}