package com.busreservationsystem.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.busreservationsystem.application.dto.common.TripDto;


@Repository
public interface TripRepository extends JpaRepository<TripDto ,Long>{

}
