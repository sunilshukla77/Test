package com.sumit.java.stream;

import java.io.Serializable;

public class School implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4059519387307690288L;
	String student;
	transient String stanerd;
	int rollno;
	public String getStudent() {
		return student;
	}
	public void setStudent(String student) {
		this.student = student;
	}
	public String getStanerd() {
		return stanerd;
	}
	public void setStanerd(String stanerd) {
		this.stanerd = stanerd;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	

}