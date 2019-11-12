package com.soloProject.controller;

import com.soloProject.model.User;
import com.soloProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/admin")
    public String adminPage(Model model) {
        List<User> users = userService.readUsers();
        model.addAttribute("userList", users);

        return "admin";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
