package com.ojas.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ojas.model.Adrdress;

@Entity
@Table(name = "emp")
public class Employee {

	@Id
	private Integer id;
	
	@Column(length = 20)
	private String firstName;
	
	@Column(length = 20)
	private String lastName;
	
	@Column(length = 10)
	private Integer phoneNumber;
	
	@Column(length = 40)
	@Embedded
	private Adrdress adress;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public Integer getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Adrdress getAdress() {
		return adress;
	}
	public void setAdress(Adrdress adress) {
		this.adress = adress;
	}
}
