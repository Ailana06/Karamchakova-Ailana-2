package org.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    private static final Logger logger = LoggerFactory.getLogger(CourseService.class);

    public String getHelloMessage() {
        logger.info("getHelloMessage() called");
        String message = "Hello from Courses Service!";
        logger.debug("Message: {}", message);
        return message;
    }
}