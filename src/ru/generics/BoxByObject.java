package ru.generics;

public class BoxByObject {
    private Object value;

    BoxByObject(Object value) {
        this.value = value;
    }

    public Object getValue(){
        return this.value;
    }
}
