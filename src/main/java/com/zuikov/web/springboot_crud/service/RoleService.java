package com.zuikov.web.springboot_crud.service;



import com.zuikov.web.springboot_crud.model.Role;

import java.util.List;

public interface RoleService {

    List<Role> allRoles();

    Role findRoleByName(String name);
}

