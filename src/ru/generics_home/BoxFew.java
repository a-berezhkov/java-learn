package ru.generics_home;

public class BoxFew<K, T> {

    private K key;
    private T obj;

    public BoxFew(K key, T obj) {
        this.key = key;
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "Box{" +
                "key=" + key +
                "; keyType=" + key.getClass().getName() +
                ", obj=" + obj +
                "; objType=" + obj.getClass().getName() +
                '}';
    }
}
