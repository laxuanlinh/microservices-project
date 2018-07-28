package com.example.accountservice.resources;


import com.example.accountservice.models.User;
import com.example.accountservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/userss")
public class UserResource {

    //TODO: add new unit test

    private final UserService userService;

    @Autowired
    public UserResource(UserService userService) {
        this.userService = userService;
    }


    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity greeting(){
//        List<User> users = userService.getAccounts();
        return new ResponseEntity(HttpStatus.OK);
    }

}
