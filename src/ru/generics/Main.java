package ru.generics;
// Дженерики с примитивами не работают, только с обертками
public class Main {

    public static void main(String[] args) {

        BoxByObject box1 = new BoxByObject(2);
        BoxByObject box2 = new BoxByObject("str");
        BoxByObject box3 = new BoxByObject(2.3);

        Object value = box2.getValue();

        Box<String> box4 = new Box<String>("123");
        Box<Integer> box5 = new Box<Integer>(123);
        Box<Double> box6 = new Box<Double>(123.12);
//        box4.getValue();
//        box5.getValue();
        DoubleBox<String, String> box7 = new DoubleBox<String, String>("123", "ddadad");
        box7.getValue1();
        box7.getValue2();

        // "Алмазный синтаксис" (diamond operator)
        DoubleBox<Integer, String> box8 = new DoubleBox<>(123, "fdsfdsf");
        box8.getValue1();

        // Типизированный метод
        Service service = new Service();
        int val1 = service.echo(2);
        String val2 = service.echo("str");

        System.out.println(val1);
        System.out.println(val2);

        // Ограничение на типизацию
        NumberBox<Integer> numberBox = new NumberBox<>(999);
        System.out.println(numberBox.getNumber());

        NumberBox<Double> doubleBox = new NumberBox<>(999.11);
        System.out.println(doubleBox.getNumber());
    }
}
