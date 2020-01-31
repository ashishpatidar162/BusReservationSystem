package com.busreservationsystem.application.dto.common;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.busreservationsystem.application.model.AgencyModel;

@Entity
@Table(name="bus")
public class BusDto {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="code",nullable=false)
	private String code;
	
	@Column(name="capacity",nullable=false)
	private int capacity;
	
	@Column(name="make",nullable=false)
	private String make;
	
//	@OneToOne
//	@JoinColumn(name="agency",nullable=false)
//	private Agency agency;
//	
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
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
//	public Agency getAgency() {
//		return agency;
//	}
//	public void setAgency(Agency agency) {
//		this.agency = agency;
//	}
	
	
	

}
