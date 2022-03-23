package ru.job4j.oop;

public class Student {
    public void music() {
        System.out.println("tra tra tra");
    }

    public void music(String lyrics) {
        System.out.println("I can sign a song : " + lyrics);
    }

    public void song() {
        System.out.println("I believe I van fly");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        String song = "I believe, I can fly";
        petya.music(song);
        petya.music();
        petya.music();
        petya.music();
        petya.song();
        petya.song();
        petya.song();
    }
}
