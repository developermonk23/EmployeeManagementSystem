package com.devmonk.EmployeeManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devmonk.EmployeeManagementSystem.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
