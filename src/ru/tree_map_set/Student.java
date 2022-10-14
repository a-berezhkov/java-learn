package ru.tree_map_set;

public class Student {
    private String name;
    private String surname;
    private String info;

    public Student(String name, String surname, String info) {
        this.name = name;
        this.surname = surname;
        this.info = info;
    }

    @Override
    public String toString() {
        return String.format("%s %s (%s)", surname, name, info);
    }
}
