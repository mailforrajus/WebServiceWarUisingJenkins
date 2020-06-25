package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Employee;

@RestController
@RequestMapping("/ëmployee")
public class EmployeeController {
	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	@RequestMapping(value = "/getEmployeesInfo")
	public List<Employee> getLIstOfEmployees() {
		logger.info("Entering into getLIstOfEmployees()");

		List<Employee> listOfEmployees = new ArrayList<>();
		for (int i = 0; i <= 100; i++) {
			listOfEmployees.add(new Employee(101 + i, "Govindaraja", 50000.00 + (i * 2)));
		}
		logger.info("Exiting into getLIstOfEmployees()");
		return listOfEmployees;
	}
}
