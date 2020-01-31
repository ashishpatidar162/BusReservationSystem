package com.busreservationsystem.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class BusReservationSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusReservationSystemApplication.class, args);
	}

}
