package org.example.log;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Slf4j
public class Main {

    private static int dividend = 11;
    private static int divider = 5;

//    private static Logger logger;
    public static void main(String[] args) {
//        logger = LogManager.getRootLogger();
        if (dividend % divider == 0) {
            System.out.println("There is no remaind :)");
        } else {
            log.info("There is remainder!");
        }
    }
}
