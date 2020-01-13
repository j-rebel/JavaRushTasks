package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private int age;
        private String race;
        private String sex;
        private boolean isAlive = true;
        private int height;

        public Human () {
            System.out.println("I'm default human, you have nothing on me!");
        }

        public Human (String name, int age, String race, String sex, boolean isAlive, int height) {
            this.name = name;
            this.age = age;
            this.race = race;
            this.sex = sex;
            this.isAlive = isAlive;
            this.height = height;
        }

        public Human (String name, int age, String race, String sex, boolean isAlive) {
            this.name = name;
            this.age = age;
            this.race = race;
            this.sex = sex;
            this.isAlive = isAlive;
        }

        public Human (String name, int age, String race, String sex) {
            this.name = name;
            this.age = age;
            this.race = race;
            this.sex = sex;
        }

        public Human (String name, int age, String race) {
            this.name = name;
            this.age = age;
            this.race = race;
        }

        public Human (String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human (String name) {
            this.name = name;
        }

        public Human (String...args) {
            this.name = args[0];
            this.race = args[1];
            this.sex = args[2];
        }

        public Human (int...args) {
            this.age = args[0];
            this.height = args[1];
        }

        public Human (boolean isAlive) {
            this.isAlive = isAlive;
        }

    }
}
