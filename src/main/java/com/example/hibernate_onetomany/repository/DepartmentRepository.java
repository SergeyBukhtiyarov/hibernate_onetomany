package com.example.hibernate_onetomany.repository;

import com.example.hibernate_onetomany.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository <Department, Long> {
    Department findById(long id);
    Department deleteById(long id);
    Department findByName(String name);

}
