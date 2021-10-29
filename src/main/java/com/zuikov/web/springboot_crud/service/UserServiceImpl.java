package com.zuikov.web.springboot_crud.service;

import com.zuikov.web.springboot_crud.dao.UserDAO;
import com.zuikov.web.springboot_crud.model.Role;
import com.zuikov.web.springboot_crud.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    private final UserDAO userDAO;
    private final Set<Role> allRoles;

    public UserServiceImpl(UserDAO userDAO, Set<Role> allRoles){
        this.userDAO = userDAO;
        this.allRoles = allRoles;
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> getAllUser() {
        return userDAO.getAllUser();
    }

    @Transactional(readOnly = true)
    @Override
    public User getById(Long id) {
        return userDAO.getById(id);
    }

    @Override
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }

    @Override
    public void deleteById(Long id) {
        userDAO.deleteById(id);
    }

    @Override
    public void update(User user) {
         userDAO.update(user);
    }

    @Transactional(readOnly = true)
    @Override
    public User getUserByName(String name) {
        return userDAO.getUserByName(name);
    }
}
