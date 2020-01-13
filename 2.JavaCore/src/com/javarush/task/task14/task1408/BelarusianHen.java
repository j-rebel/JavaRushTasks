package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen {
    public String country = Country.BELARUS;
    public int getCountOfEggsPerMonth(){return 4;}
    String getDescription() {
        return super.getDescription() + " Моя страна - " + country + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";

    }
}
