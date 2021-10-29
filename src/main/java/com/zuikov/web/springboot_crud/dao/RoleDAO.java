package com.zuikov.web.springboot_crud.dao;

import com.zuikov.web.springboot_crud.model.Role;

import java.util.List;

public interface RoleDAO {

    List<Role> allRoles();

    Role findRoleByName(String name);
}
