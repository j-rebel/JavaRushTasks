package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static int count = 0;

    public static boolean getPositive (int a) {
        boolean res;
        if (a > 0 && a != 0) {res = true;} else {res = false;}
        return res;
    }

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            String input = reader.readLine();
            int check = Integer.parseInt(input);
            if (getPositive(check)) {count++;}
        }
        System.out.println(count);
    }
}
