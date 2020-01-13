package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream newStream = new FileInputStream(reader.readLine());

        int min = Integer.MAX_VALUE;

        while (newStream.available() > 0) {
            int data = newStream.read();

            if (data < min) {min = data;}
        }

        System.out.println(min);
        newStream.close();

    }
}
