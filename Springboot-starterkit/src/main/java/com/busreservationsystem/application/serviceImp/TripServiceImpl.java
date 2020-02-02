package com.busreservationsystem.application.serviceImp;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.busreservationsystem.application.dto.common.TripDto;
import com.busreservationsystem.application.model.TripModel;
import com.busreservationsystem.application.repository.TripRepository;
import com.busreservationsystem.application.service.TripService;



@Component
public class TripServiceImpl implements TripService {


	@Autowired
	TripRepository tripRepository;
	
	private Mapper mapper = new DozerBeanMapper();

	public TripDto createPostTrip(TripModel tripModel) {	
	
		//Convert model into DTO.
		TripDto tripDto = mapper.map(tripModel, TripDto.class);
		TripDto savedData = tripRepository.save(tripDto);	
		
		return savedData;

	}
	public List<TripModel> getTrip(){
		
	List<TripDto>	tripListDto=tripRepository.findAll();

	List<TripModel> savedData=new ArrayList<>();
	
	   //convert DTO to Model
	ListIterator list=tripListDto.listIterator();
		while(list.hasNext()) {
			
			TripDto   ADTO=(TripDto)list.next();
			System.out.print(ADTO);    
			
		
		//	savedData= mapper.map(, TripModel.class);
		  
		   
		     
		}
		return savedData;
	}
}
