package ru.generics;

public class Box <T> {

    private T value;

    public Box(T value){
        this.value = value;

    }

    public T getValue(){
        System.out.println(this.value);
        return this.value;
    }
}
