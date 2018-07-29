package com.example.accountservice.dao;

import com.example.accountservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@RepositoryRestResource(path = "users")
public interface UserRepository extends JpaRepository<User, Long> {

//    Optional<User> findById(Long id);
//
    Optional<User> findByUsername(String username);

}
