package com.moseswilliamsiii.myrestfulservice.controllers;

import com.moseswilliamsiii.myrestfulservice.model.FilterBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class FilteringController {

    @GetMapping("/filtering")
    public FilterBean retrieveSomebean(){
        return new FilterBean("yes","yes","yes");

    }

    @GetMapping("/filtering-list")
    public List<FilterBean> retrieveSomebeanList(){
        return Arrays.asList(new FilterBean("yes","yes","yes"),new FilterBean("what","what","what"));

    }
}
