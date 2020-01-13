package com.javarush.task.task16.task1613;

/* 
Big Ben clock
*/

import java.util.Calendar;
import java.util.Date;

public class Solution {
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock("Лондон", 23, 59, 57);
        Thread.sleep(4000);
        isStopped = true;
        Thread.sleep(1000);
    }

    public static class Clock extends Thread {
        private String cityName;
        private int hours;
        private int minutes;
        private int seconds;

        public Clock(String cityName, int hours, int minutes, int seconds) {
            this.cityName = cityName;
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            start();
        }

        public void run() {
            try {
                while (!isStopped) {
                    printTime();
                }
            } catch (InterruptedException e) {
            }
        }

        private void printTime() throws InterruptedException {
            //add your code here - добавь код тут
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.HOUR_OF_DAY,hours);
            cal.set(Calendar.MINUTE,minutes);
            cal.set(Calendar.SECOND,seconds);

            Date d = cal.getTime();
            //System.out.println(d);



            d.setTime(d.getTime() + 1000);
            seconds = d.getSeconds();
            minutes = d.getMinutes();
            hours = d.getHours();



            if (hours == 0 && minutes == 0 && seconds == 0) {
                System.out.println(String.format("В г. %s сейчас полночь!", cityName));
            } else {
                System.out.println(String.format("В г. %s сейчас %d:%d:%d!", cityName, hours, minutes, seconds));
            }

            Thread.sleep(1000);


        }
    }
}
