package ru.generics_home;

public class Main {

    public static void main(String[] args) {
        // Task 1

        Box<String> ex1 = new Box<>("Какой-то текст");
        System.out.println(ex1);

        Box<Integer> ex2 = new Box<>(1);
        System.out.println(ex2);

        Box<Boolean> ex3 = new Box<>(true);
        System.out.println(ex3);

        // Task 2
        BoxFew<String, String> ex4 = new BoxFew<>("Какой-то текст", "И еще текст");
        System.out.println(ex4);

        BoxFew<Integer, Boolean> ex5= new BoxFew<>(123, true);
        System.out.println(ex5);

        // Task3
        FruitBox<String, Banana>  bananaBox = new FruitBox<>("banana", new Banana());
        bananaBox.getObj().printClass();

        FruitBox<String, Apple>  appleBox = new FruitBox<>("apple", new Apple());
        appleBox.getObj().printClass();

        FruitBox<String, Fruit> fruitBox = new FruitBox<>("fruit", new Fruit());
        fruitBox.getObj().printClass();


        VegetableBox<String, Cabbage> cabbageBox = new VegetableBox<>("cabbage", new Cabbage());
        cabbageBox.getObj().printClass();


    }
}
