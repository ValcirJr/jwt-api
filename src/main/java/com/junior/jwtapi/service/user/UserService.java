package com.junior.jwtapi.service;

import com.junior.jwtapi.domain.Role;
import com.junior.jwtapi.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
