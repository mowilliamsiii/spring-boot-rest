package com.moseswilliamsiii.myrestfulservice.repo;

import com.moseswilliamsiii.myrestfulservice.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}
