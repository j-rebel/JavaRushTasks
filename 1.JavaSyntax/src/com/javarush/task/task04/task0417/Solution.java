package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int count = 5;
        int [] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(reader.readLine());
            numbers[i] = a;
        }
        /*System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);*/
        for (int i = 0; i < numbers.length; i++) {
            for (int y = numbers.length - 1; y >= 0; y--) {
                if (numbers[i] == numbers[y] && i != y) {
                    System.out.print(numbers[i] + " ");
                    break;
                }
            }
        }
    }
}