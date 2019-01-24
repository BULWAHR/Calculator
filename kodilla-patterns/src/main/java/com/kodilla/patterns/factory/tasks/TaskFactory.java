package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskType, String taskName, String parameter2, String parameter3 ) {
        switch (taskType) {
            case SHOPPING:
                return new ShoppingTask(taskName, parameter2, Double.parseDouble(parameter3));
            case PAINTING:
                return new PaintingTask(taskName, parameter2, parameter3);
            case DRIVING:
                return new DrivingTask(taskName, parameter2, parameter3);
            default:
                return null;
        }
    }
}
