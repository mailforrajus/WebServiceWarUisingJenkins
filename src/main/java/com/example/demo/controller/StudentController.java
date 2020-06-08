package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StudentBean;

@RestController
@RequestMapping(value = "/studentInfo")
public class StudentController {

	@RequestMapping(value = "/getStudentInfo")
	public StudentBean getStudetns() {
		StudentBean studentInfo = null;
		for (int i = 0; i <= 10; i++) {

			studentInfo = new StudentBean(i + 100, "Govind", (i + 100) * 2);
		}

		return studentInfo;
	}

}
