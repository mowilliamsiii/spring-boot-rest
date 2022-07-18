package com.moseswilliamsiii.myrestfulservice.versioning;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {

    @RequestMapping("/v1")
    public Person getPerson1(){
        return new Person("Bob Charles");
    }

    @RequestMapping("/v2")
    public PersonV2 getPerson2(){
        return new PersonV2(new Name("Bob", "ThompsonV2"));
    }
}
