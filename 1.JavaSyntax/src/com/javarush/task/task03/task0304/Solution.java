package com.javarush.task.task03.task0304;

/* 
Задача на проценты
*/

public class Solution {
    public static double addTenPercent(int i) {
       return i + i/10.00; //напишите тут ваш код
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}
