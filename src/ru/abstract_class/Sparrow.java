package ru.abstract_class;

public class Sparrow extends Bird {
    public String color;

    public Sparrow(String color){
        super(color);
    }

    public void fly(){
        System.out.println("Воробей летит");
    }
    public void eat(){
        System.out.println("Воробей ест");
    }
    public void voice(){
        System.out.println("Чик - чирик");
    }
}
