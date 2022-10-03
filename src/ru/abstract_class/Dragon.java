package ru.abstract_class;

public class Dragon implements Flyble, Voiceble {

    public void voice(){
        System.out.println("weeeeeeeeeeeeeeee!!!");

    }
    public void  fly(){
        System.out.println("Dragon fly!");
    }
}
