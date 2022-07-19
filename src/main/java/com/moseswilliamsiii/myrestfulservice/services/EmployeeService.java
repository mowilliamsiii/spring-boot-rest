package com.moseswilliamsiii.myrestfulservice.services;

import com.moseswilliamsiii.myrestfulservice.model.Employee;
import com.moseswilliamsiii.myrestfulservice.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public List<Employee> findAll(){
        return employeeRepo.findAll();
    }

    public Optional<Employee> findById(int id){
        return employeeRepo.findById(id);
    }

    public void deleteUserById(int id){
        employeeRepo.deleteById(id);
    }

    public Employee saveEmployee(Employee employee){
        return employeeRepo.save(employee);
    }
}
