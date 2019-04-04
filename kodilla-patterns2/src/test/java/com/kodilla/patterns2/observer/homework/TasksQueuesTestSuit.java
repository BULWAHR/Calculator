package com.kodilla.patterns2.observer.homework;

import javafx.concurrent.Task;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TasksQueuesTestSuit {

    @Test
    public void testTasksQueue() {
        TasksQueue FirstQueue = new TasksQueue("1st_queue");
        TasksQueue SecondQueue = new TasksQueue("2nd_queue");
        TasksQueue ThirdQueue = new TasksQueue("3rd_queue");
        TasksQueue ForthQueue = new TasksQueue("4th_queue");

        Mentor MentorOne = new Mentor("MentorI");
        Mentor MentorTwo = new Mentor("MentorII");

        SecondQueue.registerObserver(MentorOne);
        FirstQueue.registerObserver(MentorTwo);
        ThirdQueue.registerObserver(MentorTwo);
        ForthQueue.registerObserver(MentorOne);

        FirstQueue.addTask("Task3");
        FirstQueue.addTask("Task8");
        SecondQueue.addTask("Task2");
        SecondQueue.addTask("Task5");
        ThirdQueue.addTask("Task1");
        ThirdQueue.addTask("Task6");
        ForthQueue.addTask("Task4");
        ForthQueue.addTask("Task7");

        assertEquals(4, MentorOne.getUpdateCount());
        assertEquals(4, MentorTwo.getUpdateCount());
    }
}
