package ru.generics_home;

public class FruitBox <K, T extends Fruit> {
    private K key;
    private T obj;

    public FruitBox(K key, T obj) {
        this.key = key;
        this.obj = obj;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
