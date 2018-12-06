package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("\nTest - pierwszy test jednostkowy:\n");

        Calculator calculator = new Calculator ();

        int result2 = calculator.add(6, 3);
        int result3 = calculator.subtract(6, 3);

        if (result2 == 9)  {
            System.out.println("Add test OK");
        } else {
            System.out.println("Error!");
        }

        if (result3 == 3) {
            System.out.println("Subtract test OK");
        } else {
            System.out.println("Error!");
        }
    }
}