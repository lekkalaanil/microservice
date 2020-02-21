package com.ojas.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.EmployeeRepository;
import com.ojas.model.Employee;

@RestController
public class RestControllerDemo {

	@Autowired
	EmployeeRepository repository;

	@GetMapping(value = "/getemp")
	String getAllEmployee() {
		Employee employee = new Employee();

		List<Employee> empList = new ArrayList<>();

		List<com.ojas.entity.Employee> emp = repository.findAll();
		
		for (com.ojas.entity.Employee employee2 : emp) {
			BeanUtils.copyProperties(employee2, employee);
			empList.add(employee);
		}
		ModelMap model=new ModelMap();
		model.addAttribute(empList);
		return "employee";
	}

}
