package com.javarush.task.task17.task1715;

import java.util.ArrayList;
import java.util.List;

/* 
Аптека
*/

public class Solution {
    public static DrugsController drugsController = new DrugsController();
    public static boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Thread apteka = new Thread(new Apteka());
        Thread man = new Thread(new Person(), "Мужчина");
        Thread woman = new Thread(new Person(), "Женщина");

        apteka.start();
        man.start();
        woman.start();

        Thread.sleep(1000);
        isStopped = true;
    }

    public static class Apteka implements  Runnable{

        public void run(){
            while (!isStopped){
                drugsController.buy(getRandomDrug(),getRandomCount());

                int i=0;
                while (i<3){
                    waitAMoment();;
                    i++;
                }
            }
        }
    }

    public static class Person implements Runnable {


        @Override
        public void run() {
            while (!isStopped){
                drugsController.sell(getRandomDrug(),getRandomCount());
                waitAMoment();
            }
        }
    }

    public static int getRandomCount() {
        synchronized (DrugsController.class){
            return (int) (Math.random() * 3) + 1;}
    }

    public static Drug getRandomDrug() {
        synchronized (DrugsController.class){
            int index = (int) ((Math.random() * 1000) % (drugsController.allDrugs.size()));
            List<Drug> drugs = new ArrayList<>(drugsController.allDrugs.keySet());
            return drugs.get(index);}
    }

    private static void waitAMoment() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}
