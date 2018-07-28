package com.example.accountservice.services;

import com.example.accountservice.dao.UserRepository;
import com.example.accountservice.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    //TODO: add new unit tests

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public List<User> getAccounts(){
        return userRepository.findAll();
    }

}
