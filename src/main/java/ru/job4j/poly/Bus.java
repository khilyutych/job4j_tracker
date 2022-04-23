package ru.job4j.poly;

public class Bus implements Transport{
    @Override
    public void derive() {
        System.out.println("автобус едет");
    }

    @Override
    public void people(int number) {
        System.out.println("колличество челоек: " + number);
    }

    @Override
    public int oil(int vol) {
        return 60 * vol;
    }

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.derive();
        bus.oil(55);
        bus.people(23);
    }
}
