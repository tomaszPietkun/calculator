package com.calculator;

public class Calculator {
    int x;
    int y;

    public Calculator(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int addition() {
        System.out.println("It works!");
        return x + y;
    }

    public int substraction () {
        System.out.println("It works too!");
        return x - y;
    }

    public static void main(String args[]) {
        Calculator calculator = new Calculator(15, 10);
        calculator.addition();
        calculator.substraction();
    }
}
