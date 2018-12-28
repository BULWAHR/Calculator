package com.kodilla.testing.forum.statistics;

import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class ForumStatisticsTestSuite {

    private Statistics statisticsMock;
    private ForumStatistics forumStatistics;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Before
    public void beforeTest(){
        System.out.println("Test Case: begin");

        statisticsMock = mock(Statistics.class);
        List<String>listMock = new ArrayList<>();
        for(int i=0; i<5; i++){
            listMock.add("User");
        }
        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.postsCount()).thenReturn(15);
        when(statisticsMock.commentsCount()).thenReturn(60);
        forumStatistics = new ForumStatistics();
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }



    @Test
    public void testWithZeroPosts(){

        when(statisticsMock.postsCount()).thenReturn(0);

        forumStatistics.calculateAdvStatistics(statisticsMock);

        assertEquals(0, forumStatistics.getPostsNumber());
        assertEquals(0, forumStatistics.getPostsAveragePerUser(), 0.01);
        assertEquals(0, forumStatistics.getCommentsAveragePerPost(), 0.01);

    }

    @Test
    public void testWithThousandPosts(){
        when(statisticsMock.postsCount()).thenReturn(1000);
        forumStatistics.calculateAdvStatistics(statisticsMock);

        assertEquals(1000, forumStatistics.getPostsNumber());
        assertEquals(200, forumStatistics.getPostsAveragePerUser(), 0.01);
        assertEquals(0.06, forumStatistics.getCommentsAveragePerPost(), 0.01);
    }

    @Test
    public void testWithZeroComments(){
        when(statisticsMock.commentsCount()).thenReturn(0);
        forumStatistics.calculateAdvStatistics(statisticsMock);

        assertEquals(0, forumStatistics.getCommentsNumber());
        assertEquals(0, forumStatistics.getCommentsAveragePerUser(), 0.01);
        assertEquals(0, forumStatistics.getCommentsAveragePerPost(), 0.01);
    }

    @Test
    public void testCommentsLessThanPosts(){
        when(statisticsMock.commentsCount()).thenReturn(2);
        when(statisticsMock.postsCount()).thenReturn(10);
        forumStatistics.calculateAdvStatistics(statisticsMock);

        assertEquals(10, forumStatistics.getPostsNumber());
        assertEquals(2, forumStatistics.getCommentsNumber());
        assertEquals(2, forumStatistics.getPostsAveragePerUser(), 0.01);
        assertEquals(0.4, forumStatistics.getCommentsAveragePerUser(), 0.01);
        assertEquals(0.2, forumStatistics.getCommentsAveragePerPost(), 0.01);
    }

    @Test
    public void testCommentsMoreThanPosts(){

        forumStatistics.calculateAdvStatistics(statisticsMock);

        assertEquals(15, forumStatistics.getPostsNumber());
        assertEquals(60, forumStatistics.getCommentsNumber());
        assertEquals(3, forumStatistics.getPostsAveragePerUser(), 0.01);
        assertEquals(12, forumStatistics.getCommentsAveragePerUser(), 0.01);
        assertEquals(4, forumStatistics.getCommentsAveragePerPost(), 0.01);
    }

    @Test
    public void testWithZeroUsers(){
        List<String>listMock = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(listMock);
        forumStatistics.calculateAdvStatistics(statisticsMock);

        assertEquals(0, forumStatistics.getUsersNumber());
        assertEquals(0, forumStatistics.getPostsAveragePerUser(), 0.01);
        assertEquals(0, forumStatistics.getCommentsAveragePerUser(), 0.01);

    }

    @Test
    public void testWithHundredUsers(){
        List<String> listMock = new ArrayList<>();
        for(int i=0; i<100; i++){
            listMock.add("User");
        }
        when(statisticsMock.usersNames()).thenReturn(listMock);
        forumStatistics.calculateAdvStatistics(statisticsMock);

        assertEquals(100, forumStatistics.getUsersNumber());
        assertEquals(0.15, forumStatistics.getPostsAveragePerUser(), 0.01);
        assertEquals(0.6, forumStatistics.getCommentsAveragePerUser(), 0.01);
    }
}

