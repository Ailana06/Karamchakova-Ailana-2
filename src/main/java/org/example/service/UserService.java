package org.example.service;

import org.example.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;

    public String getHelloMessage() {
        logger.info("getHelloMessage() called");
        String message = "Hello from User Service!";
        logger.debug("Message: {}", message);
        return message;
    }
}
