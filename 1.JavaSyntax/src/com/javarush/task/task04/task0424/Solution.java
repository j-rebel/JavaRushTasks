package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int [] check = new int [3];
        for (int i = 0; i < 3; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String readLine = reader.readLine();
            int readInt = Integer.parseInt(readLine);
            check [i] = readInt;
        }
        if (check[0] == check[1]){
            System.out.println("3");
        } else if (check[0] == check[2]) {
            System.out.println("2");
        } else if (check[1] == check[2]) {
            System.out.println("1");
        }

    }
}
