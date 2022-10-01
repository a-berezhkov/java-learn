package ru.polygame.weapon;

public class Rogatka extends Weapon{
    @Override
    public void shot() {
        System.out.println("it's " +getClass().getName());
    }
}
