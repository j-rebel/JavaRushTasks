package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen{
    public String country = Country.UKRAINE;
    public int getCountOfEggsPerMonth(){return 1;}
    String getDescription() {
        return super.getDescription() + " Моя страна - " + country + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
