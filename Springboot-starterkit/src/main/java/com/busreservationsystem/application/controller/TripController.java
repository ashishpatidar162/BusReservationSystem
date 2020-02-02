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

import com.busreservationsystem.application.dto.common.TripDto;
import com.busreservationsystem.application.model.TripModel;
import com.busreservationsystem.application.repository.TripRepository;
import com.busreservationsystem.application.serviceImp.TripServiceImpl;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
public class TripController {

	@Autowired
	TripRepository tripRepository;
	
	@Autowired
	private TripServiceImpl tripServiceImpl;
	
	private Mapper mapper = new DozerBeanMapper();

	@GetMapping("/Trip")
	public List<TripDto> getAllTrips() {
		return tripRepository.findAll();
	}
	
	@PostMapping("/tripCreate")
	public TripModel createTrip(@RequestBody TripModel tripModel) {
		System.out.println("In create trip method."+ tripModel);
		
		TripDto savedData=tripServiceImpl.createPostTrip(tripModel);
			
		return mapper.map(savedData, TripModel.class);
	}
}
