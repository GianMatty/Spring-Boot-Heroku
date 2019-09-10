package com.gianmatty.Spring_Boot_Heroku.controller;

import com.gianmatty.Spring_Boot_Heroku.entity.User;
import com.gianmatty.Spring_Boot_Heroku.repository.RoleRepository;
import com.gianmatty.Spring_Boot_Heroku.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class UserController {

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    UserService userService;

    @GetMapping("/userForm")
    public String getUserForm(Model model) {
        model.addAttribute("userForm", new User());
        model.addAttribute("roles",roleRepository.findAll());
        model.addAttribute("userList", userService.getAllUsers());
        model.addAttribute("listTab","active");
        return "user-form/user-view";
    }

    @GetMapping({"/","/login"})
    public String index() {
        return "index";
    }
}
