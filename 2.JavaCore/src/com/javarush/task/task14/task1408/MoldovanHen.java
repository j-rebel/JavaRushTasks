package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen {
    public String country = Country.MOLDOVA;
    public int getCountOfEggsPerMonth(){return 3;}
    String getDescription() {
        return super.getDescription() + " Моя страна - " + country + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";

}}
