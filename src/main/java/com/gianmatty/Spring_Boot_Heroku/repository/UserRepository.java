package com.gianmatty.Spring_Boot_Heroku.repository;

import com.gianmatty.Spring_Boot_Heroku.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    public Optional<User> findByUsername(String username);
}
