package com.example.app;

public class Calculator {
    public double divide(double a, double b) {
        // Bug: ArithmeticException - division by zero
        return a / b;
    }
    
    public int multiply(int x, int y) {
        return x * y;
    }
    
    public double sqrt(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of negative number");
        }
        return Math.sqrt(number);
    }
}
