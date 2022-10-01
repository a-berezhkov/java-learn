package ru.mycompany;

public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Нельзя меньше 0");
            return;
        } else if (age > 150) {
            System.out.println("Не больше 150");
            return;
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void happyBirthDay() {
        this.age++;
        System.out.println("Happy birthday" + age);
    }
}
