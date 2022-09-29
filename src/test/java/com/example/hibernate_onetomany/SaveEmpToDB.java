package com.example.hibernate_onetomany;

import com.example.hibernate_onetomany.entity.Department;
import com.example.hibernate_onetomany.entity.Employee;
import com.example.hibernate_onetomany.repository.DepartmentRepository;
import com.example.hibernate_onetomany.repository.EmployeeRepository;
import com.example.hibernate_onetomany.services.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SaveEmpToDB {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    EmployeeService employeeService;

    @Autowired
    DepartmentRepository departmentRepository;


    @Test
    public void addEmpToDB() {
        Employee employee1 = new Employee();
        employee1.setName("Sergey");
        employee1.setSurname("Bukhtiyarov");
        employee1.setSalary(5000);


        Employee employee2 = new Employee();
        employee2.setName("Mary");
        employee2.setSurname("Strizhneva");
        employee2.setSalary(6000);


        Employee employee3 = new Employee();
        employee3.setName("Alex");
        employee3.setSurname("Bukhtiyarov");
        employee3.setSalary(5000);


        Employee employee4 = new Employee();
        employee4.setName("Igor");
        employee4.setSurname("Ivanov");
        employee4.setSalary(6000);


        Department department1 = new Department();
        department1.setName("IT");
        department1.setMin_salary(500);
        department1.setMax_salary(7000);

        Department department2 = new Department();
        department2.setName("HR");
        department2.setMin_salary(200);
        department2.setMax_salary(2000);

        Department department3 = new Department();
        department3.setName("Salary");
        department3.setMin_salary(300);
        department3.setMax_salary(3000);


        department1.addEmpToDepartment(employee1);
        department1.addEmpToDepartment(employee4);
        department2.addEmpToDepartment(employee2);
        department3.addEmpToDepartment(employee3);
        departmentRepository.save(department1);
        departmentRepository.save(department2);
        departmentRepository.save(department3);

//employeeService.saveEmployee(employee1);
//employeeService.saveEmployee(employee2);
//employeeService.saveEmployee(employee3);

        departmentRepository.deleteById(1);
        System.out.println(departmentRepository.findByName("Sales"));
        System.out.println(employeeRepository.findById(3L));


    }


}
