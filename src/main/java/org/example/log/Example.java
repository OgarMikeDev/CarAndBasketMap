package org.example.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Example {
    private static final Logger logger = LoggerFactory.getLogger(Example.class);

    public void doSomething() {
        logger.info("Starting doSomething method");
        // some code here
        logger.info("Finished doSomething method");
    }
}