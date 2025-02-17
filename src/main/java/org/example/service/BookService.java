package org.example.service;

import org.example.repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private static final Logger logger = LoggerFactory.getLogger(BookService.class);

    @Autowired
    private BookRepository  bookRepository;

    public String getHelloMessage() {
        logger.info("getHelloMessage() called");
        String message = "Hello from Book Service!";
        logger.debug("Message: {}", message);
        return message;
    }
}