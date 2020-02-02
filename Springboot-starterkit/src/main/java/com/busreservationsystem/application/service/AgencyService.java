package com.busreservationsystem.application.service;

import java.util.List;

import com.busreservationsystem.application.dto.common.AgencyDto;
import com.busreservationsystem.application.model.AgencyModel;

public interface AgencyService {

	public AgencyDto createPostAgency(AgencyModel agencyModel);
	
	public List<AgencyModel> getAgency();
}
