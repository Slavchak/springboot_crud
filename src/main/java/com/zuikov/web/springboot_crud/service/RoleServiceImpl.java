package com.zuikov.web.springboot_crud.service;

import com.zuikov.web.springboot_crud.dao.RoleDAO;
import com.zuikov.web.springboot_crud.model.Role;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class RoleServiceImpl implements RoleService {

    private final RoleDAO roleDAO;

    public RoleServiceImpl(RoleDAO roleDAO) {
        this.roleDAO = roleDAO;
    }

    @Override
    public List<Role> allRoles() {
        return roleDAO.allRoles();
    }

    @Override
    public Role findRoleByName(String name) {
        return roleDAO.findRoleByName(name);
    }
}
