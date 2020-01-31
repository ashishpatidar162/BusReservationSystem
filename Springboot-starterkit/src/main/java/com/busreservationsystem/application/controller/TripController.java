package com.busreservationsystem.application.controller;

import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.busreservationsystem.application.dto.common.AgencyDto;
import com.busreservationsystem.application.model.AgencyModel;
import com.busreservationsystem.application.repository.AgencyRepository;
import com.busreservationsystem.application.repository.TripRepository;
import com.busreservationsystem.application.serviceImp.ServiceImpl;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
public class TripController {

	@Autowired
	TripRepository tripRepository;
	
	@Autowired
	AgencyRepository agencyRepository;
	
	@Autowired
	private ServiceImpl serviceImpl;
	
	private Mapper mapper = new DozerBeanMapper();
	
//	Mapper ma
	
	@GetMapping("/Agency")
	public List<AgencyDto> getAllTrips() {
		return agencyRepository.findAll();
	}
	
	@PostMapping("/agencyCreate")
	public AgencyModel createAgency(@RequestBody AgencyModel agencyModel) {
		System.out.println("In create agency method."+ agencyModel);
		
		AgencyDto savedData=serviceImpl.createPostAgency(agencyModel);
		
		//call service layer here.
		
		
		//Convert model into DTO.
//		AgencyDto agencyDto = mapper.map(agencyModel, AgencyDto.class);
//		AgencyDto savedData = agencyRepository.save(agencyDto);
		
		return mapper.map(savedData, AgencyModel.class);
	}
}
