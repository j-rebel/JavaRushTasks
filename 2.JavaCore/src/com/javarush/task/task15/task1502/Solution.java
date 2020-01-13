package com.javarush.task.task15.task1502;

/* 
ООП - Наследование животных
*/

public class Solution {
    //добавьте классы Goose и Dragon тут

    public static void main(String[] args) {
        /*
        BigAnimal big = new BigAnimal();
        System.out.println(big.getSize());
        SmallAnimal small = new SmallAnimal();
        System.out.println(small.getSize());
        Goose goose = new Goose();
        System.out.println(goose.getSize());
        Dragon dragon = new Dragon();
        System.out.println(dragon.getSize());
*/
    }

    public static class BigAnimal {
        protected String getSize() {
            return "как динозавр";
        }
    }

    public static class SmallAnimal {
        String getSize() {
            return "как кошка";
        }
    }

    public static class Dragon extends BigAnimal {
        public String getSize() {
            return "Дракон большой, " + super.getSize();
        }
    }

    public static class Goose extends SmallAnimal {
        public String getSize() {
            return "Гусь маленький, " + super.getSize();
        }
    }

}
