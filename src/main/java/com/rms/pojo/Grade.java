package com.rms.pojo;

import java.util.Date;

public class Grade {

	private String ds;
	private String grade;
	private Date start;
	private Date end;
	
	public Grade(String ds, String grade, Date start, Date end) {
		super();
		this.ds = ds;
		this.grade = grade;
		this.start = start;
		this.end = end;
	}

	public Grade() {
		super();
	}

	public String getDs() {
		return ds;
	}

	public void setDs(String ds) {
		this.ds = ds;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}
	
	
}
