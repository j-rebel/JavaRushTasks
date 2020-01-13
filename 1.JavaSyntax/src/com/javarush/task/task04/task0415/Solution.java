package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader1.readLine();
        int i1 = Integer.parseInt(s1);
        String s2 = reader1.readLine();
        int i2 = Integer.parseInt(s2);
        String s3 = reader3.readLine();
        int i3 = Integer.parseInt(s3);
        if (i1 >= i2 + i3 || i2 >= i1 + i3 || i3 >= i1 + i2) {
            System.out.println("Треугольник не существует.");
        } else {
            System.out.println("Треугольник существует.");
        }


        }
    }
