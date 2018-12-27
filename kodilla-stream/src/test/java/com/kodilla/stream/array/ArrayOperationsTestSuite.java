package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int numbers [] = {5,12,32,73,16,7,34,19,10,9,26,14,63,78,22,8,24,53,56,95};
        double averageExpected = 32.8;
        //When
        double average = ArrayOperations.getAverage(numbers);
        //Then
        Assert.assertEquals(averageExpected, average, 0.001);
    }
}