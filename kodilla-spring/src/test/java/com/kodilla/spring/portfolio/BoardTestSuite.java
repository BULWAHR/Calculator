package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {

        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);

        Board board = context.getBean(Board.class);

        board.getToDoList().addTask("Task to be done");
        board.getInProgressList().getTasks().add("Task in progress");
        board.getDoneList().addTask("Task finished");

        String task1 = board.getToDoList().getTasks().get(0);
        String task2 = board.getInProgressList().getTasks().get(0);
        String task3 = board.getDoneList().getTasks().get(0);

        Assert.assertEquals("Task to be done", task1);
        Assert.assertEquals("Task in progress", task2);
        Assert.assertEquals("Task finished", task3);
    }
}