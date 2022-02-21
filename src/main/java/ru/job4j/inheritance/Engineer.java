package ru.job4j.inheritance;

public class Engineer extends Profession{
    private String program;

    public Engineer(String name, String surname, String education, char birthday, String program) {
        super(name, surname, education, birthday);
        this.program = program;
    }

    public boolean useProgram(){
        return true;
    }

}
