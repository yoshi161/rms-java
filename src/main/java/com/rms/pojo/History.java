package com.rms.pojo;

import java.util.Date;
import java.util.List;

public class History {

	private Date from;
	private Date to;
	private String client;
	private String role;
	private List<String> jobDescs;
	
	
	public History() {
		super();
	}
	
	public History(Date from, Date to, String client, String role,
			List<String> jobDescs) {
		super();
		this.from = from;
		this.to = to;
		this.client = client;
		this.role = role;
		this.jobDescs = jobDescs;
	}
	
	public Date getFrom() {
		return from;
	}
	public void setFrom(Date from) {
		this.from = from;
	}
	public Date getTo() {
		return to;
	}
	public void setTo(Date to) {
		this.to = to;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public List<String> getJobDescs() {
		return jobDescs;
	}
	public void setJobDescs(List<String> jobDescs) {
		this.jobDescs = jobDescs;
	}
	
	
}
