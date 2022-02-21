package ru.job4j.inheritance;

public class Builder extends Engineer{
    private String drawings;

    public Builder(String name, String surname, String education, char birthday, String program, String drawings) {
        super(name, surname, education, birthday, program);
        this.drawings = drawings;
    }

    public boolean useDrawings(){
        return true;
    }

}
