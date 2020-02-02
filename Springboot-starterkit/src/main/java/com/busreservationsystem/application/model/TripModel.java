package com.busreservationsystem.application.model;


public class TripModel {

	private int id;
	
	private int fare;
	
	private int journeyTime;
	
	private String sourceStopName;
	
	private String sourceStopCode;
	
	private String destinationStopName;
	
	private String destinationStopCode;
	
	private String busCode;
	
	private String agencyCode;

	

	public void setId(int id) {
		this.id = id;
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
	
	public void setJourneyTime(int journeyTime) {
		this.journeyTime=journeyTime;
	}
	
	public int getJourneyTime() {
		return journeyTime;
	}
	
	public void setSourceStopName(String sourceStopName) {
		this.sourceStopName=sourceStopName;
	}
	
	public String getSourceStopName() {
		return sourceStopName;
	}
	
	public void setSourceStopCode(String sourceStopCode) {
		this.sourceStopCode=sourceStopCode;
	}
	
	public void setDestinationStopName(String destinationStopName) {
		this.destinationStopName=destinationStopName;
	}
	
	public String getDestinationStopName() {
		return destinationStopName;
	}
	
	public void setDestinationStopCode(String destinationStopCode) {
		this.destinationStopCode=destinationStopCode;
	}
	
	public String getDestinationStopCode() {
		return destinationStopCode;
	}
	
	public void setBusCode(String busCode) {
		this.busCode=busCode;
	}
	
	public String getBusCode() {
		return busCode;
	}
	
	public void setAgencyCode(String agencyCode) {
		this.agencyCode=agencyCode;
	}
	
	public String getAgencyCode() {
		return agencyCode;
	}
	
	
	@Override
	public String toString() {
		return "Trip [id=" + id + ", fare=" + fare + ", journeyTime=" + journeyTime + ", sourceStopName="
				+ sourceStopName + ", sourceStopCode=" + sourceStopCode + ", destinationStopName=" + destinationStopName
				+ ", destinationStopCode=" + destinationStopCode + ", busCode=" + busCode + ", agencyCode=" + agencyCode
				+ "]";
	}
}
