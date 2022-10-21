package com.sample.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {

    public static void main(String args[]) {
        Logger logger = LoggerFactory.getLogger(HelloWorld.class);
        for (int i=0; i<= 50000; i++) {
            logger.info("Hello i am here!");
            // do some execution
            logger.debug("this is a debug");
            logger.info("i am done");
        }
    }

}