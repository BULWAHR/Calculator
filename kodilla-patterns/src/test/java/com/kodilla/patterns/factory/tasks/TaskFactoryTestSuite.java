package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testShoppingTask() {

        TaskFactory taskFactory = new TaskFactory();

        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING, "Going shoping", "candy", "14.5");
        boolean isExecuted = shopping.isTaskExecuted();
        shopping.executeTask();

        Assert.assertEquals("Going shoping", shopping.getTaskName());
        Assert.assertFalse(isExecuted);
        Assert.assertTrue(shopping.isTaskExecuted());
    }

    @Test
    public void testPaintingTask() {

        TaskFactory taskFactory = new TaskFactory();

        Task painting = taskFactory.makeTask(TaskFactory.PAINTING, "Painting all walls", "Yellow", "Room");
        boolean isExecuted = painting.isTaskExecuted();
        painting.executeTask();

        Assert.assertEquals("Painting all walls", painting.getTaskName());
        Assert.assertFalse(isExecuted);
        Assert.assertTrue(painting.isTaskExecuted());
    }

    @Test
    public void testDrivingTask() {

        TaskFactory taskFactory = new TaskFactory();

        Task driving = taskFactory.makeTask(TaskFactory.PAINTING, "Test drive", "Around the block", "BMW 1M");
        boolean isExecuted = driving.isTaskExecuted();
        driving.executeTask();

        Assert.assertEquals("Test drive", driving.getTaskName());
        Assert.assertFalse(isExecuted);
        Assert.assertTrue(driving.isTaskExecuted());
    }
}
