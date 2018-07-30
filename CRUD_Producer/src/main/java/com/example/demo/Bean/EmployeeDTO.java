package com.example.demo.Bean;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EmployeeDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private String name;
	private String mobile;
	private String mail;
	private String salary;

	public String getName() {
		return name;
	}

	public EmployeeDTO() {
		super();
	}

	public EmployeeDTO(String name, String mobile, String mail, String salary) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.mail = mail;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [name=" + name + ", mobile=" + mobile + ", mail=" + mail + ", salary=" + salary + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
}
