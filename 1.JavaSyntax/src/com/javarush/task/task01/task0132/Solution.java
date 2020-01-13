package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        String s = Integer.toString(number);
        char[] chArray = s.toCharArray();
        int a = Character.getNumericValue(chArray[0]);
        int b = Character.getNumericValue(chArray[1]);
        int c = Character.getNumericValue(chArray[2]);
        int res = a + b + c;
        return res;
        //напишите тут ваш код
    }
}