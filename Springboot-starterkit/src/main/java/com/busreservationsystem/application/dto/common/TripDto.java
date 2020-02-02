package com.busreservationsystem.application.dto.common;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

import com.busreservationsystem.application.model.AgencyModel;
import com.busreservationsystem.application.model.BusModel;

@Entity
@Table(name ="trip")
//@SecondaryTable(name="agency", pkJoinColumns=@PrimaryKeyJoinColumn(name="id" ,referencedColumnName ="agency"))
public class TripDto {

	@Id
	@Column(name= "id")
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	
	@Column(name="fare" )
	private int fare;
	
	@Column(name="journeyTime")
	private int journeyTime;
	
	
//	@Column(name="sourceStop",nullable=false)
//	private Stop sourceStop;
//	
//	@Column(name="destStop",nullable=false)
//	private Stop destStop;
	
//	@OneToOne
//	@JoinColumn(name="bus",nullable=false)
//	private Bus bus;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	  @JoinColumn(name="agency")
	  private AgencyDto agency;
 
	
	public AgencyDto getAgency() {
		  return agency;
	}
	public void	setAgency(AgencyDto agency) {
		this.agency = agency;
	}
	 
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	
	public void setFare(int fare) {
		this.fare=fare;
	}
	
	public int getFare() {
		return fare;
	}

	public void setJourneyTime() {
		this.journeyTime=journeyTime;
	}
	
	public int getJourneyTime() {
		return journeyTime;
	}
	
//	public void setSourceStop(Stop sourceStop) {
//		this.sourceStop = sourceStop;
//	}
//	
//	public Stop getSourceStop() {
//		return sourceStop;
//	}
//	
//	public void setDestStop(Stop destStop) {
//		this.destStop=destStop;
//	}
//	
//	public Stop getDestStop() {
//		return destStop;
//	}
		
//	public void setBus(Bus bus) {
//		this.bus=bus;
//	}
//	public Bus getBus() {
//		return bus;
//	}
	
	
	
	
	
}
