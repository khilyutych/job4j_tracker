package ru.job4j.inheritance;

public class Doctor extends Profession{
    private String medical;

    public Doctor(String name, String surname, String education, char birthday, String medical) {
        super(name, surname, education, birthday);
        this.medical = medical;
    }

    public boolean thingMedical(){
        return true;
    }

}
