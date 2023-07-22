package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Recruiter {
	
	@Id
	private Long rec_id;
	
	@Column(name = "Recruiter_Name")
	private String recName;
	private String email;
	private String company;
	private String password;
	
	public Recruiter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Recruiter(Long rec_id, String recName, String email, String company, String password) {
		super();
		this.rec_id = rec_id;
		this.recName = recName;
		this.email = email;
		this.company = company;
		this.password = password;
	}
	public Long getRec_id() {
		return rec_id;
	}
	public void setRec_id(Long rec_id) {
		this.rec_id = rec_id;
	}
	public String getRecName() {
		return recName;
	}
	public void setRecName(String recName) {
		this.recName = recName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}



}
