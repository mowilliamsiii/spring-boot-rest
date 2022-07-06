package com.moseswilliamsiii.myrestfulservice.controllers;

import com.moseswilliamsiii.myrestfulservice.model.User;
import com.moseswilliamsiii.myrestfulservice.services.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//User resource
@RestController
public class UserController {

    @Autowired
    private UserDaoService userDaoService;

    //GET /users
    //retrieveAllUsers
    @GetMapping(path = "/users")
    public List<User> getAllUsers(){
        return userDaoService
                .findAll();
    }


    //GET /users/{id}
    //retrieveUser(int id)
    @GetMapping(path = "/users/{id}")
    public User getUser(@PathVariable int id){
        return userDaoService.findUser(id);
    }
}
