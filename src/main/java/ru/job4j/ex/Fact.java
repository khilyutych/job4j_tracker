package ru.job4j.ex;

public class Fact {
    public int calc(int n) {
        int rsl = 1;
        for (int index = 2; index <= n; index++) {
            if (n < 0) {
                throw new IllegalArgumentException("N could not be less then 0");
            }
            rsl *= index;
        }
        return rsl;
    }

    public static void main(String[] args) {
        new Fact().calc(-1);
    }
}
