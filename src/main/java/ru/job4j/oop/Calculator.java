package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int b) {
        return Math.abs(b - x);
    }

    public int divide(int c) {
        return c / x;
    }

    public int sumAllOperation(int d) {
        Calculator calculator = new Calculator();
        return calculator.sumAllOperation(sum(d) + multiply(d) + minus(d) + divide(d));
    }


    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        System.out.println(minus(6));
        System.out.println(calculator.divide(10));
        System.out.println(calculator.sumAllOperation(10));
    }
}

