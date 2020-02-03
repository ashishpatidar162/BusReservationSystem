package com.busreservationsystem.application.serviceImp;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.busreservationsystem.application.dto.common.AgencyDto;
import com.busreservationsystem.application.model.AgencyModel;
import com.busreservationsystem.application.repository.AgencyRepository;
import com.busreservationsystem.application.service.AgencyService;



@Component
public class AgencyServiceImpl implements AgencyService {


	@Autowired
	AgencyRepository agencyRepository;
	
	private Mapper mapper = new DozerBeanMapper();
	
	//Creating Agency Data
	public AgencyDto createPostAgency(AgencyModel agencyModel) {	
	
		//Convert model into DTO.
		AgencyDto agencyDto = mapper.map(agencyModel, AgencyDto.class);
		AgencyDto savedData = agencyRepository.save(agencyDto);	
		
		return savedData;

	}
	
	//Get Agency Data 
	public List<AgencyModel> getAgency(){
		
	List<AgencyDto>	agencyListDto=agencyRepository.findAll();

	List<AgencyModel> savedData=new ArrayList<>();
	
	   //convert DTO to Model
	ListIterator<AgencyDto> list=agencyListDto.listIterator();
		while(list.hasNext()) {
			
			AgencyDto   ato=(AgencyDto)list.next();
			System.out.print(ato);    
			
		
			savedData.add(mapper.map(ato, AgencyModel.class));
		}
		return savedData;
	}
}
