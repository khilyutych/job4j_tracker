package ru.job4j.poly;

public class MiniBus implements Vehicle{
    @Override
    public void move() {
        System.out.println("автобус двигается по скоростным трассам");
    }
}
