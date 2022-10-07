package ru.exept_home;


public class User {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private String pass;
    private int age;

    public User(String name, String pass, int age) {
        this.name = name;
        this.pass = pass;
        this.age = age;
    }
}

