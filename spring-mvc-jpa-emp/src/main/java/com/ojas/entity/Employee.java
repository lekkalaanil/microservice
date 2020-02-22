package com.ojas.entity;

import javax.persistence.Column;
import javax.persistence.Id;

@javax.persistence.Entity
public class Employee {
	
	@Id
	private Integer eid;
	
	@Column(length = 20)
	private String ename;
	
	public Employee()
	{
		
	}
	
	public Employee(Integer eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}
	
	
	

}
