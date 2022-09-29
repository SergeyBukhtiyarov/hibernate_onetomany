package com.example.hibernate_onetomany.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String surname;
    private long salary;

    @ToString.Exclude
    @ManyToOne(cascade = CascadeType.ALL)
    private Department dep;

//    @Override
//    public String toString() {
//        return "Employee{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                ", salary=" + salary +
//                '}';
//    }
}
