package com.ascendingdc.training.debug;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FirstClass {
    private static Logger logger = LoggerFactory.getLogger(FirstClass.class);
    public static void main(String[] args){
        String st1;
        logger.info("infomation ");
        st1="abcd";
        System.out.println(st1);
        logger.debug(st1);
        logger.warn("WARNING");
    }
}
