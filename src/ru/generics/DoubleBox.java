package ru.generics;

public class DoubleBox<T,V> {

    private T value1;
    private V value2;

    public DoubleBox(T value1, V value2){
        this.value1 = value1;
        this.value2 = value2;

    }

    public T getValue1(){
        System.out.println(this.value1);
        return this.value1;
    }

    public V getValue2(){
        System.out.println(this.value2);
        return this.value2;
    }
}
