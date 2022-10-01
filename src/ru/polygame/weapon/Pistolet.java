package ru.polygame.weapon;

public class Pistolet extends Weapon
{
    @Override
    public void shot() {
        System.out.println("int's " +getClass().getName());
    }
}
