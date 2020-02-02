package com.busreservationsystem.application.service;

import java.util.List;

import com.busreservationsystem.application.dto.common.TripDto;
import com.busreservationsystem.application.model.TripModel;

public interface TripService {
	
	public TripDto createPostTrip(TripModel tripModel);

	public List<TripModel> getTrip();
}
