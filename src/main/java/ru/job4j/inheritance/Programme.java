package ru.job4j.inheritance;

public class Programme extends Engineer{
    private String drawings;

    public Programme(String name, String surname, String education, char birthday, String program, String drawings) {
        super(name, surname, education, birthday, program);
        this.drawings = drawings;
    }

    public boolean useDrawings(){
        return false;
    }

}
