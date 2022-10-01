package ru.polygame.weapon;

public class WaterPistolet extends Weapon {
    @Override
    public void shot() {
        System.out.println("int's " +getClass().getName());
    }
}
