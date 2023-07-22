package com.model;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class Internship {
	
	@Id

	private long id;
	private String company_name;
	private String domain;
	private String duration;
	private String location;

	@ManyToOne
	private Recruiter recruiter;
	
	@OneToOne
	private Interns interns;
	

	public Internship() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Internship(long id, String company_name, String domain, String duration, String location,
			Recruiter recruiter, Interns interns) {
		super();
		this.id = id;
		this.company_name = company_name;
		this.domain = domain;
		this.duration = duration;
		this.location = location;
		this.recruiter = recruiter;
		this.interns = interns;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Recruiter getRecruiter() {
		return recruiter;
	}

	public void setRecruiter(Recruiter recruiter) {
		this.recruiter = recruiter;
	}

	public Interns getInterns() {
		return interns;
	}

	public void setInterns(Interns interns) {
		this.interns = interns;
	}

	
	
	
}
