package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog(){

        Logger logger = Logger.getInstance();
        logger.log("Log example");

        String log = logger.getLastLog();

        Assert.assertEquals(log, "Log example");
    }
}