package com.keerthana.demo.Model;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Application {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int applnID;
	private String username;
	private String city;
	private String email;
	private String qualification;
	private String experience;
	private int age;
	
	@ManyToOne
	@JoinColumn(name="job_id")
	@Autowired
	private Job job;

	public Application() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Application(int applnID, String username, String city, String email, String qualification, String experience,
			int age, Job job) {
		super();
		this.applnID = applnID;
		this.username = username;
		this.city = city;
		this.email = email;
		this.qualification = qualification;
		this.experience = experience;
		this.age = age;
		this.job = job;
	}

	public int getApplnID() {
		return applnID;
	}

	public void setApplnID(int applnID) {
		this.applnID = applnID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}
	
	
	
}
