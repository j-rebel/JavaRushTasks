package com.javarush.task.task15.task1529;

public class Plane implements CanFly {
    private int passagersNum = 0;

    public void fly() {}

    public Plane(int passagersNum) {
        this.passagersNum = passagersNum;
    }
}
