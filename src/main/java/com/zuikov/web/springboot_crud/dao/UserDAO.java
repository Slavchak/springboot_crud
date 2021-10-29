package com.zuikov.web.springboot_crud.dao;

import com.zuikov.web.springboot_crud.model.User;

import java.util.List;

public interface UserDAO {

    List <User> getAllUser();

    User getById(Long id);

    void saveUser(User user);

    void deleteById(Long id);

    void update(User user);

    User getUserByName(String name);

}
