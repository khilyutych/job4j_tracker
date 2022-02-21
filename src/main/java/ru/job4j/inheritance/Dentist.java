package ru.job4j.inheritance;

public class Dentist extends Doctor{
    private String heart;

    public Dentist(String name, String surname, String education, char birthday, String medical, String heart) {
        super(name, surname, education, birthday, medical);
        this.heart = heart;
    }

    public boolean thingHeart(){
        return false;
    }

}
