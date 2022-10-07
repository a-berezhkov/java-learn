package ru.generics_home;

public class Box<T> {
    private T obj;

    public Box(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "{Box " +
                "obj = " + obj +
                "; objType= " + obj.getClass().getName() +
                "}";
    }
}
