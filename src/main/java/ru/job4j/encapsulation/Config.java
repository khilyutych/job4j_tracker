package ru.job4j.encapsulation;

public class Config {
    private String name;
    public int position;
    public String properties;

    private Config(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(position);
    }

    public String getProperty(String key) {
        return properties;
    }

    private String search(String key) {
        return key;
    }
}
