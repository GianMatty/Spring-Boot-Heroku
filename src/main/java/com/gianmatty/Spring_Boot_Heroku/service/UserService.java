package com.gianmatty.Spring_Boot_Heroku.service;

import com.gianmatty.Spring_Boot_Heroku.entity.User;

public interface UserService {
    public Iterable<User> getAllUsers();
}
