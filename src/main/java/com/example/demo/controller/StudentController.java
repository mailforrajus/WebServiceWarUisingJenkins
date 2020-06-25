package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StudentBean;

@RestController
@RequestMapping(value = "/studentInfo")
public class StudentController {

	private static final Logger logger = org.slf4j.LoggerFactory.getLogger(StudentController.class);

	@RequestMapping(value = "/getStudentInfo")
	public List<StudentBean> getStudetns() {
		StudentBean studentInfo = null;
		List<StudentBean> listINfo = new ArrayList<>();
		for (int i = 0; i <= 10; i++) {

			studentInfo = new StudentBean(i + 100, "Govind", (i + 100) * 2);
			listINfo.add(studentInfo);
		}

		return listINfo;
	}

	@RequestMapping("/printInfo")
	public void print() {
		logger.info("Controller entered into print method");
	}

}
