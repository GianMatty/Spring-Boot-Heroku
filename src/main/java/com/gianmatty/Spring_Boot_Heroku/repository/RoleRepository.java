package com.gianmatty.Spring_Boot_Heroku.repository;

import com.gianmatty.Spring_Boot_Heroku.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
}
