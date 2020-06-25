package com.example.demo.entity;

public class StudentBean {
	private int studentID;
	private String studentName;
	private double studentMarks;

	public StudentBean(int studentID, String studentName, double studentMarks) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(double studentMarks) {
		this.studentMarks = studentMarks;
	}

	public StudentBean() {
		super();
	}

}
