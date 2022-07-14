package com.moseswilliamsiii.myrestfulservice.services;

import com.moseswilliamsiii.myrestfulservice.model.Customer;
import com.moseswilliamsiii.myrestfulservice.model.User;

import java.util.ArrayList;
import java.util.List;

public interface CustomerService {


    List<Customer> findAll();

    Customer save(Customer customer);

    Customer findCustomerById(int id);

    Customer deleteCustomerById(int id);
}
