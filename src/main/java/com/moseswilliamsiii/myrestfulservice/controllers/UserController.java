package com.moseswilliamsiii.myrestfulservice.controllers;

import com.moseswilliamsiii.myrestfulservice.exceptions.UserNotFoundException;
import com.moseswilliamsiii.myrestfulservice.model.User;
import com.moseswilliamsiii.myrestfulservice.services.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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
        User user = userDaoService.findUser(id);
        if(user == null){
            throw new UserNotFoundException("id " + id);
        }
        return user;
    }

    //creating a new user POST
    //Need input (details of user)
    //The output should be CREATED status code and the created URI
    @PostMapping(path = "/users")
    public ResponseEntity<Object> createUser(@RequestBody User user){

        User savedUser = userDaoService.save(user);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}").buildAndExpand(savedUser.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

}
