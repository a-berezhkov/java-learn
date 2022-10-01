package ru.mycompany;

public class Singer extends Person {

    private String name;
    public Singer(String name, int age, int rating){
        super(name, age);
        this.rating = rating;
    }
    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int rating;

    public void sing(String what){
        System.out.println("I" + name + what);
    }

    @Override
    public void happyBirthDay() {
        if (age < 10){
            super.happyBirthDay(); // Вызов метода предка
        } else {
            System.out.println("Привет! Певец!");
        }


    }
}
