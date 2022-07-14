package com.moseswilliamsiii.myrestfulservice.controllers;

import com.moseswilliamsiii.myrestfulservice.model.Customer;
import com.moseswilliamsiii.myrestfulservice.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

   @GetMapping("/customers")
    public List<Customer> getCustomers(){
        if(customerService.findAll().isEmpty()){
            return List.of();
        }else{
            return customerService.findAll();
        }
    }
}
