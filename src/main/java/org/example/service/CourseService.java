package org.example.service;

import org.example.repository.CourseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    private static final Logger logger = LoggerFactory.getLogger(CourseService.class);

    @Autowired
    private CourseRepository courseRepository;

    public String getHelloMessage() {
        logger.info("getHelloMessage() called");
        String message = "Hello from Courses Service!";
        logger.debug("Message: {}", message);
        return message;
    }
}