package com.ojas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.ojas.model.Employee;
import com.ojas.service.EmployeeService;

@Controller
public class OjasController {

	@Autowired
	EmployeeService service;

	@GetMapping("/")
	ModelAndView getIndex() {
		return new ModelAndView("index");
	}

	@GetMapping(value = "/getEmp")
	String getEmp(ModelMap map) {
		map.addAttribute("employee", new Employee(1, "abc"));

		return "emplist";
	}

	@GetMapping(value = "/getEmpByEid/{eid}")
	String getEmpById(@PathVariable Integer eid, ModelMap map) {
		Employee emp = service.getEmployeeByEid(eid);
		System.out.println(emp);
		map.addAttribute("emp", emp);
		return "empbyid";
	}

}
