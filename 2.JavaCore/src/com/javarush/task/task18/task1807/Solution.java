package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        //String fName = "C:\\Users\\JRebel\\Desktop\\file.txt";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream newStream = new FileInputStream(reader.readLine());

        int count = 0;

        while (newStream.available() > 0) {
            int data = newStream.read();

            char charForData = (char) data;

            if (charForData == ',') {count++;}
        }

        System.out.println(count);
        newStream.close();





    }
}
