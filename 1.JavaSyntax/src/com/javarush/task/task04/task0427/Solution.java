package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        int strLength = input.length();
        int check = Integer.parseInt(input);
        String numDesc = " ";
        if (strLength == 1) {numDesc = "однозначное ";}
        if (strLength == 2) {numDesc = "двузначное ";}
        if (strLength == 3) {numDesc = "трехзначное ";}
        String oddEven = "";
        if (check % 2 == 0) {oddEven = "четное ";} else {oddEven = "нечетное ";}
        if (check > 0 && check < 1000) {
            System.out.println(oddEven + numDesc + "число");
        }
    }
}
