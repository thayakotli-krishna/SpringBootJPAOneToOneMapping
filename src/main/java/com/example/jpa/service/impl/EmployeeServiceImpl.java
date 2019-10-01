package com.example.jpa.service.impl;

import com.example.jpa.entities.Employee;
import com.example.jpa.repository.EmployeeRepository;
import com.example.jpa.service.AccountService;
import com.example.jpa.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository, AccountService accountService) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee findOne(Long employeeId) {
        return employeeRepository.findById(employeeId).orElseGet(null);
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }
}
