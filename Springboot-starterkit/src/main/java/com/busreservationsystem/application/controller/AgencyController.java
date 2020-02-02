package com.busreservationsystem.application.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.busreservationsystem.application.dto.common.AgencyDto;
import com.busreservationsystem.application.model.AgencyModel;
import com.busreservationsystem.application.repository.AgencyRepository;
import com.busreservationsystem.application.serviceImp.AgencyServiceImpl;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
public class AgencyController {

	@Autowired
	AgencyRepository agencyRepository;

	@Autowired
	private AgencyServiceImpl agencyServiceImpl;

	private Mapper mapper = new DozerBeanMapper();

	@GetMapping("/Agency")
	public List<AgencyDto> getAllAgencys() {
		return agencyRepository.findAll();
	}

	@PostMapping("/agencyCreate")
	public AgencyModel createAgency(@RequestBody AgencyModel agencyModel) {
		System.out.println("In create agency method." + agencyModel);

		AgencyDto savedData = agencyServiceImpl.createPostAgency(agencyModel);

		return mapper.map(savedData, AgencyModel.class);
	}

	@GetMapping("/Agency/{id}")
	public Optional<AgencyDto> getAgencyById(@PathVariable(value = "id") Integer agencyId) {
		Optional<AgencyDto> agency = agencyRepository.findById(agencyId);
		return agency;
	}
	
	@PutMapping("/Agency/{id}")
	public ResponseEntity<AgencyDto> updateEmployee(@PathVariable(value = "id") Integer agencyId,
			@Valid @RequestBody AgencyModel agencyDetails){
		Optional<AgencyDto> agencydto = agencyRepository.findById(agencyId);
		AgencyDto agencyDto=new AgencyDto();	
		agencyDto.setCode(agencyDetails.getCode());
		agencyDto.setDetails(agencyDetails.getDetails());
		agencyDto.setName(agencyDetails.getName());
		final AgencyDto updatedAgency= agencyRepository.save(agencyDto);
		return ResponseEntity.ok(updatedAgency);
	}

	@DeleteMapping("/Agency/{id}")
	public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Integer agencyId){
		Optional<AgencyDto> agency = agencyRepository.findById(agencyId);

		agencyRepository.delete(agency.get());
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
	}
