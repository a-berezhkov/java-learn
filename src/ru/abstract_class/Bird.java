package ru.abstract_class;

public abstract class Bird implements Voiceble, Flyble {

    String color;

    public Bird(String color){
        this.color = color;
    }

    public abstract void fly();
    public abstract void voice();



}
