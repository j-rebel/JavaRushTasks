package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        int check = Integer.parseInt(input);
        String modul = "";
        String odd = "";
        if (check > 0) {modul = "положительное ";}
        else if (check < 0) {modul = "отрицательное ";}
        if (check % 2 == 0) {odd = "четное ";}
        else {odd = "нечетное ";}
        if (check == 0) {
            System.out.println("ноль");
        } else {
            System.out.println(modul + odd + "число");
        }

    }
}
