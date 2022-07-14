package com.moseswilliamsiii.myrestfulservice.services;

import com.moseswilliamsiii.myrestfulservice.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private static List<Customer> customers = new ArrayList<>();
    @Override
    public List<Customer> findAll() {
        return customers;
    }

    static{
        customers.add(new Customer(1, "Mike",false));
    }

    @Override
    public Customer save(Customer customer) {
        return null;
    }

    @Override
    public Customer findCustomerById(int id) {
        return null;
    }

    @Override
    public Customer deleteCustomerById(int id) {
        return null;
    }
}
