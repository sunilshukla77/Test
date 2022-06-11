package com.sumit.java.stream;

import java.io.Serializable;
/*
 * DTO-> Data transfer object
 */
public class SchoolDto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4059519387307690288L;
	
	private String classTeacher;
	private String studentName;
	private String section;
	private int rollno;
	
	public String getClassTeacher() {
		return classTeacher;
	}
	public void setClassTeacher(String classTeacher) {
		this.classTeacher = classTeacher;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	
	
	

}
