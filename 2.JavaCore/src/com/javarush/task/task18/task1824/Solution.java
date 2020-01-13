package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        FileInputStream fis;

        while (true) {

            input = reader.readLine();

            try {
                fis = new FileInputStream(input);
                fis.close();
            } catch (FileNotFoundException e) {
                System.out.println(input);
                reader.close();
                break;
            }

        }

    }
}
