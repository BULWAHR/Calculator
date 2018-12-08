package com.kodilla.testing.collection;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;

public class CollectionTestSuite {

    private static OddNumbersExterminator oddNumbersExterminator;
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }

    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){

        oddNumbersExterminator = new OddNumbersExterminator();

        ArrayList<Integer> emptyList = new ArrayList<>();
        List<Integer> resultList = oddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing empty list");

        Assert.assertEquals(emptyList, resultList);
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){

        oddNumbersExterminator = new OddNumbersExterminator();

        ArrayList<Integer> fullList = new ArrayList<>();
        fullList.add(6);
        fullList.add(9);
        fullList.add(3);
        fullList.add(4);
        fullList.add(7);
        fullList.add(8);


        ArrayList<Integer>exterminatedList = new ArrayList<>();
        exterminatedList.add(6);
        exterminatedList.add(4);
        exterminatedList.add(8);


        List<Integer> finishedList = oddNumbersExterminator.exterminate(fullList);
        System.out.println("Testing normal list");

        Assert.assertEquals(exterminatedList, finishedList);
    }
}