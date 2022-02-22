package ru.job4j.inheritance;

public class Surgeon extends Doctor{
    private String heart;

    public Surgeon(String name, String surname, String education, char birthday, String medical, String heart) {
        super(name, surname, education, birthday, medical);
        this.heart = heart;
    }

    public boolean useHeart(String medical) {
        return medical.equals(heart);
    }
}