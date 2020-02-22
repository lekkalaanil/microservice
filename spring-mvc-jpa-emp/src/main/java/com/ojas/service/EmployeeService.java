package com.ojas.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.entity.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	com.ojas.repository.EmployeeRepository repository;

	public com.ojas.model.Employee getEmployeeByEid(Integer eid) {
		
		Optional<Employee> emp= repository.findById(eid);
		Employee employee= emp.get();
		System.out.println(employee);
		com.ojas.model.Employee employee1=new com.ojas.model.Employee();
		BeanUtils.copyProperties(employee, employee1);
		System.out.println(employee1);
		
		return employee1;
	}

}
