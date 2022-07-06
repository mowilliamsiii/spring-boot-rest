package com.moseswilliamsiii.myrestfulservice.controllers;

import com.moseswilliamsiii.myrestfulservice.GreetingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//tell spring this is a controller
@RestController
public class GreetingController {

    //request method and path
    @GetMapping(path = "/greeting")
    public String greeting(){
        return "Hey. How are you?";
    }

    @GetMapping(path = "/greeting-bean")
    public GreetingBean greetingBean(){
        return new GreetingBean("Hey. I'm a greeting bean");
    }
}
