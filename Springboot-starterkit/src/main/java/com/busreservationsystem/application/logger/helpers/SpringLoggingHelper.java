package com.busreservationsystem.application.logger.helpers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SpringLoggingHelper {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    public void helpMethod(){
        logger.debug("This is a debug message  Packages HELPERS");
        logger.info("This is an info message Packages HELPERS");
        logger.warn("This is a warn message Packages HELPERS");
        logger.error("This is an error message Packages HELPERS");

    }
}
