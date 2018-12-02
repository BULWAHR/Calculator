package com.kodilla.kodillacourse;

public class Calculator {
    public static void main (String[] args) throws java.lang.Exception {

        Actions FirstAction = new Actions();
        Actions SecondAction = new Actions();

            System.out.println("Adding result is: " + FirstAction.addNumbers(7,3));
            System.out.println("Susbtraction result is: " + SecondAction.substractNumbers(5,2));
    }
}
