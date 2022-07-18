package com.moseswilliamsiii.myrestfulservice.controllers;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.moseswilliamsiii.myrestfulservice.model.Customer;
import com.moseswilliamsiii.myrestfulservice.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

//   @GetMapping("/customers")
//    public List<Customer> getCustomers(){
//        if(customerService.findAll().isEmpty()){
//            return List.of();
//        }else{
//            return customerService.findAll();
//        }
//    }

    @GetMapping("/customers")
    public MappingJacksonValue getCustomers(){
        if(customerService.findAll().isEmpty()){
            return null;
        }else{
            List<Customer> customerList = customerService.findAll();

            SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("id","name");

            FilterProvider filters = new SimpleFilterProvider().addFilter("filterObject",filter);

            MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(customerList);

            mappingJacksonValue.setFilters(filters);
            return mappingJacksonValue;
        }
    }
}



