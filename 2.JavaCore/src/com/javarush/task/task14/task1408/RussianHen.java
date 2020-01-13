package com.javarush.task.task14.task1408;

public class RussianHen extends Hen {
    public String country = Country.RUSSIA;
    public int getCountOfEggsPerMonth(){return 2;}
    String getDescription() {
        return super.getDescription() + " Моя страна - " + country + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
    }
