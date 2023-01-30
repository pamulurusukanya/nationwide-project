package com.nationwide.app.entity;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class UserDetails extends AuditModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//id Long, fname String, lname String, username String, email String, password, designation, contact num, country
	private Long id;
	private String fName;
	private String lName;
	private String userName;
	private String email;
	private String password;
	private String designation;
	private int contact_num;
	private String country;
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDetails(Long id, String fName, String lName, String userName, String email, String password,
			String designation, int contact_num, String country) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.designation = designation;
		this.contact_num = contact_num;
		this.country = country;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getContact_num() {
		return contact_num;
	}
	public void setContact_num(int contact_num) {
		this.contact_num = contact_num;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", fName=" + fName + ", lName=" + lName + ", userName=" + userName + ", email="
				+ email + ", password=" + password + ", designation=" + designation + ", contact_num=" + contact_num
				+ ", country=" + country + "]";
	}
	
	

}
