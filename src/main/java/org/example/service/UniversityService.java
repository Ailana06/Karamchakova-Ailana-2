package org.example.service;

import org.example.repository.UniversityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UniversityService {

    private static final Logger logger = LoggerFactory.getLogger(UniversityService.class);

    @Autowired
    private UniversityRepository universityRepository;

    public String getHelloMessage() {
        logger.info("getHelloMessage() called");
        String message = "Hello from University Service!";
        logger.debug("Message: {}", message);
        return message;
    }
}
