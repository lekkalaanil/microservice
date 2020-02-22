package com.ojas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ojas.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
