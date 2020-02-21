package com.ojas;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<com.ojas.entity.Employee, Integer> {

}
