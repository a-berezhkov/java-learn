package ru.abstract_class;

public class Cat implements Voiceble {

    int legs = 4;


    public Cat(int legs) {
        this.legs = legs;
    }

    @Override
    public void voice() {
        System.out.println("Meow!!!!!");

    }
}
