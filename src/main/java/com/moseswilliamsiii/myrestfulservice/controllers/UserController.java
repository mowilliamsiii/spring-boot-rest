package com.moseswilliamsiii.myrestfulservice.controllers;

import com.moseswilliamsiii.myrestfulservice.model.User;
import com.moseswilliamsiii.myrestfulservice.services.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
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

    //creating a new user POST
    //Need input (details of user)
    //The output should be CREATED status code and the created URI

    @PostMapping(path = "/users")
    public void createUser(@RequestBody User user){
        User savedUser = userDaoService.save(user);
    }

}
