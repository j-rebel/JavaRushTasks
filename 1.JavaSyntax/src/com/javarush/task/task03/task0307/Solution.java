package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg zergOne = new Zerg();
        Zerg zergTwo = new Zerg();
        Zerg zergThree = new Zerg();
        Zerg zergFour = new Zerg();
        Zerg zergFive = new Zerg();
        Zerg zergSix = new Zerg();
        for (int i = 1; i < 6; i++)
        {new Zerg();}
    }

    public static class Zerg {
        static int count = 1;
        public String name;
        public Zerg () { this.name = "Zerg"+this.count;System.out.println(this.name + " was created");plusOne();}
        public void plusOne () {count ++;};
        }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
