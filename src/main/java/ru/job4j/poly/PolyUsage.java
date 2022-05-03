package ru.job4j.poly;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle train = new Train();
        Vehicle plane = new Plane();
        Vehicle miniBus = new MiniBus();
        Vehicle[] vehicles = new Vehicle[]{train, plane, miniBus};
        for (Vehicle v : vehicles) {
            v.move();
        }
    }
}
