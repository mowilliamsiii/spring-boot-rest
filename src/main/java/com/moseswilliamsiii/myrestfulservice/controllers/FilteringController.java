package com.moseswilliamsiii.myrestfulservice.controllers;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.moseswilliamsiii.myrestfulservice.model.FilterBean;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class FilteringController {

    @GetMapping("/filtering")
    public MappingJacksonValue retrieveSomeBean(){
        FilterBean filterBean = new FilterBean("yes", "yes", "yes");

        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("value1","value2");

        FilterProvider filters = new SimpleFilterProvider().addFilter("filterObject",filter);

        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(filterBean);

        mappingJacksonValue.setFilters(filters);
        return mappingJacksonValue;

    }

    @GetMapping("/filtering-list")
    public MappingJacksonValue retrieveSomeBeanList(){
        List<FilterBean> someList = Arrays.asList(new FilterBean("yes","yes","yes"),new FilterBean("what","what","what"));

        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("value1","value2");

        FilterProvider filters = new SimpleFilterProvider().addFilter("filterObject",filter);

        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(someList);

        mappingJacksonValue.setFilters(filters);
        return mappingJacksonValue;

    }
}
