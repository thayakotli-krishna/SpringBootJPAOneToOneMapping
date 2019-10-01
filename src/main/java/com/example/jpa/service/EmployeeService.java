package com.example.jpa.service;

import com.example.jpa.entities.Employee;

public interface EmployeeService {

    Employee findOne(Long employeeId);

    Employee save(Employee employee);
}
