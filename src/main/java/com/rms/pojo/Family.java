package com.rms.pojo;

import java.util.Date;

public class Family {

	private String name;
	private String gender;
	private Date dob;
	private String type;
	private Boolean active;
	
	
	public Family() {
		super();
	}
	
	public Family(String name, String gender, Date dob, String type,
			Boolean active) {
		super();
		this.name = name;
		this.gender = gender;
		this.dob = dob;
		this.type = type;
		this.active = active;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	
	
}
