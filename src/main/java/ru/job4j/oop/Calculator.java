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
        return b - x;
    }

    public int divide(int c) {
        return c / x;
    }

    public int sumAllOperation(int d) {
        return sum(d) + multiply(d) + minus(d) + divide(d);
    }


    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
        int result1 = minus(10);
        System.out.println(result1);
        Calculator calculator = new Calculator();
        int result2 = calculator.multiply(10);
        System.out.println(result2);
        int result3 = calculator.divide(10);
        System.out.println(result3);
        int result4 = calculator.sumAllOperation(10);
        System.out.println(result4);
    }
}