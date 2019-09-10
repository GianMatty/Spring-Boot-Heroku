package com.gianmatty.Spring_Boot_Heroku.repository;

import com.gianmatty.Spring_Boot_Heroku.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
