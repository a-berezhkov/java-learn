package ru.generics;


// по нескольким критериям
//public class NumberBox <T extends Number & Someable>
public class NumberBox <T extends Number>{

    private T value;

    public NumberBox(T value){
        this.value = value;
    }

    public T getNumber() {
        return value;
    }
}
