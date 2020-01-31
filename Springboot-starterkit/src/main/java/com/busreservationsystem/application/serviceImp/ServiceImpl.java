package com.busreservationsystem.application.serviceImp;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.busreservationsystem.application.dto.common.AgencyDto;
import com.busreservationsystem.application.model.AgencyModel;
import com.busreservationsystem.application.repository.AgencyRepository;
import com.busreservationsystem.application.service.Service;

@Component
public class ServiceImpl implements Service {


	@Autowired
	AgencyRepository agencyRepository;
	
	private Mapper mapper = new DozerBeanMapper();

	public AgencyDto createPostAgency(AgencyModel agencyModel) {
		
		
				//Convert model into DTO.
				AgencyDto agencyDto = mapper.map(agencyModel, AgencyDto.class);
				AgencyDto savedData = agencyRepository.save(agencyDto);	
				
				return savedData;
		
	}
}
