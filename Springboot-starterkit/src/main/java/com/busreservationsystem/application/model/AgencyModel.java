package com.busreservationsystem.application.model;

public class AgencyModel {

	private int id;
	private String code;
	private String name;
	private String details;
//	private User owner;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetails() {
		return details;
	}
	
	public void setDetails(String details) {
		this.details = details;
	}
//	public User getOwner() {
//		return owner;
//	}
//	public void setOwner(User owner) {
//		this.owner = owner;
//	}

	
	
}
