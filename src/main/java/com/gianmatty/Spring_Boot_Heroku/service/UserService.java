package com.gianmatty.Spring_Boot_Heroku.service;

import com.gianmatty.Spring_Boot_Heroku.dto.ChangePasswordForm;
import com.gianmatty.Spring_Boot_Heroku.entity.User;

public interface UserService {
    public Iterable<User> getAllUsers();

    public User createUser(User user) throws Exception;

    public User getUserById(Long id) throws Exception;

    public User updateUser(User user) throws Exception;

    public void deleteUser(Long id) throws Exception;

    public User changePassword(ChangePasswordForm form) throws Exception;
}
