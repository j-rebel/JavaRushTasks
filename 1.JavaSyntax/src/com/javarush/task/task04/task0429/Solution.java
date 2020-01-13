package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static int countPos = 0;
    public static int countNeg = 0;

    public static boolean getPositive (int a) {
        boolean res;
        if (a > 0) {res = true;} else {res = false;}
        return res;
    }

    public static boolean notNull (int a) {
        boolean res;
        if (a != 0) {res = true;} else {res = false;}
        return res;
    }

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            String input = reader.readLine();
            int check = Integer.parseInt(input);
            if (notNull(check)) {
            if (getPositive(check)) {countPos++;} else {countNeg++;}
        } }
        System.out.println("количество отрицательных чисел: " + countNeg);
        System.out.println("количество положительных чисел: " + countPos);

    }
}
