package com.busreservationsystem.application.logger.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.busreservationsystem.application.logger.helpers.SpringLoggingHelper;

@Controller
@RestController
public class IndexController {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@GetMapping("/index")
	public String index() {
		LOGGER.debug("This is a debug message Packages INDEXCONTROLLERS");
		LOGGER.info("This is an info message Packages INDEXCONTROLLERS");
		LOGGER.warn("This is a warn message Packages INDEXCONTROLLERS");
		LOGGER.error("This is an error message Packages INDEXCONTROLLERS");
		new SpringLoggingHelper().helpMethod();
		return "index Log OutPut on Console";
	}
}
