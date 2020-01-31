package com.busreservationsystem.application.service;

import com.busreservationsystem.application.dto.common.AgencyDto;
import com.busreservationsystem.application.model.AgencyModel;

public interface Service {

	public AgencyDto createPostAgency(AgencyModel agencyModel);
	
}
