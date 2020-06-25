package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StudentBean;

@RestController
@RequestMapping(value = "/studentInfo")
public class StudentController {

	@RequestMapping(value = "/getStudentInfo")
	public List<StudentBean> getStudetns() {
		StudentBean studentInfo = null;
		List<StudentBean> listINfo= new ArrayList<>();
		for (int i = 0; i <= 10; i++) {

			studentInfo = new StudentBean(i + 100, "Govind", (i + 100) * 2);
			listINfo.add(studentInfo);
		}

		return listINfo;
	}
	
	@RequestMapping("/printInfo")
	public void print() {
		System.out.println("welcome to spring boot with Jenkins ans onsar qube");
	}

}
