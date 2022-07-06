package com.moseswilliamsiii.myrestfulservice.controllers;

import com.moseswilliamsiii.myrestfulservice.model.GreetingBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping(path = "/greeting-bean/{name}")
    public GreetingBean greetingBeanPathVar(@PathVariable String name){
        return new GreetingBean(String.format("Hey, %s. I'm a greeting bean", name));
    }
}
