package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Khilyutych Igor");
        student.setGroup("PSGD");
        student.setCreated(new Date());

        System.out.println(student.getFio() + "group" + student.getGroup() + "date of admission" + student.getCreated());
    }
}
