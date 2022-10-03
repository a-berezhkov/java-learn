package ru.abstract_class;

public class Main {

    public static void main(String[] args){
    Crow crow = new Crow("red");
    Sparrow sparrow = new Sparrow("brown");

    Dragon dragon = new Dragon();
    Cat cat = new Cat(4);


    crow.fly();
    startVoice(crow);
    startVoice(sparrow);

    startVoice(dragon);
    startVoice(cat);

    startFly(crow);
    startFly(dragon);


    }

    public static void startVoice(Voiceble obj){
        obj.voice();

    }

    public static void startFly(Flyble obj){
        obj.fly();

    }
}
