package com.ojas.model;

public class Employee {
	
	private Integer id;
	private String firstName;
	private String lastName;
	private Integer phoneNumber;
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
