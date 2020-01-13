package com.javarush.task.task15.task1530;

public abstract class DrinkMaker {

    abstract void getRightCup();
    abstract void putIngredient();
    abstract void pour();

    //выбирает чашку, кладет ингредиенты, заливает жидкостью.
    public void makeDrink() {
        getRightCup();
        putIngredient();
        pour();
    }

}
