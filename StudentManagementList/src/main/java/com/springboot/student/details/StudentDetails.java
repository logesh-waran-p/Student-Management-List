package com.springboot.student.details;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="StudentDetails")
public class StudentDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String firstName;
	private String lastName;
	private String grade;
	private int mobileNum;
	
	
	public StudentDetails() {
		super();
	}
	public StudentDetails(long id, String firstName, String lastName, String grade, int mobileNum) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.grade = grade;
		this.mobileNum = mobileNum;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(int mobileNum) {
		this.mobileNum = mobileNum;
	}
	
	
	
	
}
