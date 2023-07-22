package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Interns {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String qualification;
	private String location;
	private String userName;
	private String password;
	private String marital_status;

	
	@ManyToOne
	private Recruiter recruiter;
	


	public Interns() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Interns(Long id, String firstName, String lastName, String email, String phoneNumber, String qualification,
			String location, String userName, String password, String marital_status, Recruiter recruiter) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.qualification = qualification;
		this.location = location;
		this.userName = userName;
		this.password = password;
		this.marital_status = marital_status;
		this.recruiter = recruiter;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
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



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public String getQualification() {
		return qualification;
	}



	public void setQualification(String qualification) {
		this.qualification = qualification;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getMarital_status() {
		return marital_status;
	}



	public void setMarital_status(String marital_status) {
		this.marital_status = marital_status;
	}



	public Recruiter getRecruiter() {
		return recruiter;
	}



	public void setRecruiter(Recruiter recruiter) {
		this.recruiter = recruiter;
	}


	}


	



	



