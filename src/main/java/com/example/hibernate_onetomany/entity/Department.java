package com.example.hibernate_onetomany.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private long max_salary;
    private long min_salary;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dep", fetch = FetchType.EAGER)
    private List<Employee> employeeList;


    public void addEmpToDepartment(Employee employee) {
        if (employeeList==null) {
            employeeList = new ArrayList<>();
        }
        employeeList.add(employee);
        employee.setDep(this);

    }


}
