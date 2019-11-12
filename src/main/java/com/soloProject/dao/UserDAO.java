package com.soloProject.dao;

import com.soloProject.model.User;

import java.util.List;

public interface UserDAO {
    List<User> readUsers();

    void addUser(User user);

    User editUser(User user);

    void deleteUser(User user);

    User findByUserName(String userName);
}
