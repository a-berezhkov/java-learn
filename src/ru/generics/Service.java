package ru.generics;

public class Service {

    public <T> T echo(T value) {
        return value;
    }

//   вариант возврата
//    public <T> T echo(T value) {
//        return (T) value;
//    }
}
