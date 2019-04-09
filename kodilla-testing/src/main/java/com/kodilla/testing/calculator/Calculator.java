package com.kodilla.testing.calculator;

public class Calculator {
    private Display display;


    Calculator(Display display){
        this.display = display;
    }

    double add(double a, double b){
        double result = a + b;
        display.displayValue(result);
        return result;
    }
    double sub(double a, double b){
        double result = a - b;
        display.displayValue(result);
        return result;
    }
    double mul(double a, double b){
        double result = a * b;
        display.displayValue(result);
        return result;
    }
    double div(double a, double b){
        double result = a / b;
        display.displayValue(result);
        return result;
    }
}