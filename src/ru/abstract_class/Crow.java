package ru.abstract_class;

public class Crow  extends Bird{



    public Crow(String color){
        super(color);
    }

    public void fly(){
        System.out.println("Ворона летит");
    }
    public void eat(){
        System.out.println("Ворона ест");
    }
    public void voice(){
        System.out.println("Кар кар кар");
    }
}
