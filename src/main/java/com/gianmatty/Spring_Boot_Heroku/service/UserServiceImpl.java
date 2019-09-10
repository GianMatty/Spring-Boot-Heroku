package com.gianmatty.Spring_Boot_Heroku.service;

import com.gianmatty.Spring_Boot_Heroku.entity.User;
import com.gianmatty.Spring_Boot_Heroku.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository repository;

    @Override
    public Iterable<User> getAllUsers() {
        return repository.findAll();
    }

}
