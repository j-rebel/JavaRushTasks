package com.javarush.task.task16.task1623;

/* 
Рекурсивное создание нитей
*/

import java.util.Arrays;

public class Solution {
    static int count = 15;
    static volatile int createdThreadCount;

    public static void main(String[] args) {

            System.out.println(new GenerateThread());



    }

    public static class GenerateThread extends Thread {

        public GenerateThread() {
            super(Integer.toString(1 + createdThreadCount++));
            this.start();
            //System.out.println(this.isInterrupted());
        }

        @Override
        public String toString() {
            return this.getName() + " created " + (createdThreadCount + 2);
        }

        @Override
        public void run() {

            if (createdThreadCount <= count - 1) {
                System.out.println(new GenerateThread());}
             else {

                 this.interrupt(); System.out.println(this + " : isInterrapted " + this.isInterrupted());

             }
        }
    }
}
