package com.crmapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contacts")
public class Contact {
	@Id
	
	private long id;
	@Column(name = "first_name",length = 45,nullable = false)
	private String firstName;
	@Column(name = "last_name",length = 45,nullable = false)
	private String lastName;
	@Column(name = "email",length = 128,nullable = false,unique = true)
	private String email;
	private String leadSource;
	@Column(name = "mobile",length = 10,nullable = false,unique = true)
	private String mobile;
	public Contact() {
		
	}
	
	

	public long getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public String getLeadSource() {
		return leadSource;
	}
	public String getMobile() {
		return mobile;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setLeadSource(String leadSource) {
		this.leadSource = leadSource;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	

}
