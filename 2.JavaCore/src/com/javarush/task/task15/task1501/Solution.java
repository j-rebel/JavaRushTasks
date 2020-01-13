package com.javarush.task.task15.task1501;

/* 
ООП - Расставить интерфейсы
*/

public class Solution {
    public static void main(String[] args) {

        /*Clothes clothes = new Clothes();
        System.out.println(clothes.isMovable());
        System.out.println(clothes.getAllowedAction("строчка"));
        System.out.println(clothes.getAllowedAction());*/


    }

    public interface Movable {
        boolean isMovable();
    }

    public interface Sellable {
        Object getAllowedAction(String name);
    }

    public interface Discountable {
        Object getAllowedAction();
    }

    public static class Clothes implements Movable, Sellable, Discountable {
        public boolean isMovable() {return false;}
        public Object getAllowedAction(String name) {return "Вот такая штука" + name;}
        public Object getAllowedAction() {return "А это другая штука";}


    }
}
