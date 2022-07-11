package com.moseswilliamsiii.myrestfulservice.controllers;

import com.moseswilliamsiii.myrestfulservice.model.GreetingBean;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

//tell spring this is a controller
@RestController
public class GreetingController {

    @Autowired
    private MessageSource messageSource;

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

    @GetMapping(path = "/greeting-internationalized")
    public String greetingInternationalized(@RequestHeader(name="Accept-Language", required = false)Locale locale){
        //return "Hey. How are you?";
        return messageSource.getMessage("good.morning.message", null, "Default", locale);
    }
}
