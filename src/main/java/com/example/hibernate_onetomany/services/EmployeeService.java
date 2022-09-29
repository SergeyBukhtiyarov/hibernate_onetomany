package com.example.hibernate_onetomany.services;

import com.example.hibernate_onetomany.entity.Employee;
import com.example.hibernate_onetomany.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;



    public void saveEmployee(Employee employee){
        Employee empFromDB = employeeRepository.findById(employee.getId());
        if (empFromDB==null) {
            employeeRepository.save(employee);
        }
    }



}
