package com.moseswilliamsiii.myrestfulservice.controllers;

import com.moseswilliamsiii.myrestfulservice.exceptions.UserNotFoundException;
import com.moseswilliamsiii.myrestfulservice.model.Employee;
import com.moseswilliamsiii.myrestfulservice.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee-api")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path="/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.findAll();
    }

    @GetMapping("/employee-by-id/{id}")
    public Optional<Employee> findById(@PathVariable int id){
        Optional<Employee> employee = employeeService.findById(id);

        if(!employee.isPresent()){
            throw new UserNotFoundException("Employee with id " + id + " was not found");
        }
        return employee;
    }
    @DeleteMapping(path = "/delete/{id}")
    public void deleteUserById(@PathVariable int id){
        employeeService.deleteUserById(id);
    }

    @PostMapping("/employees")
    public ResponseEntity<Object> createEmployee(@Valid @RequestBody Employee employee){
        Employee employee1 = employeeService.saveEmployee(employee);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(employee.getId()).toUri();

        return ResponseEntity.created(location).build();
    }
}
