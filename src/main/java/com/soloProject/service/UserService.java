package com.soloProject.service;

import com.soloProject.model.User;
import com.soloProject.dao.UserDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserDAOImpl userRepository;

    @Autowired
    public UserService(UserDAOImpl userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> readUsers() {
        return userRepository.readUsers();
    }

    public void addUser(User user) {
        userRepository.addUser(user);
    }

    public User editUser(User user) {
         return userRepository.editUser(user);
    }

    public void deleteUser(User user) {
        userRepository.deleteUser(user);
    }
}
