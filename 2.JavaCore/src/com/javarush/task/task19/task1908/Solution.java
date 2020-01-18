package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in));

        String firstFileName = fileNameReader.readLine();
        String secondFileName = fileNameReader.readLine();

        fileNameReader.close();

        BufferedReader firstFileReader = new BufferedReader(new FileReader(firstFileName));

        StringBuilder builder = new StringBuilder();

        while (firstFileReader.ready()) {
            char data = (char) firstFileReader.read();
            builder.append(data);
        }

        String check = builder.toString();
        //System.out.println(check);

        String[] arr = check.split(" ");

        StringBuilder builder1 = new StringBuilder();

        Pattern pattern = Pattern.compile("\\D");
        Matcher matcher;

         for (int i = 0; i < arr.length; i++) {
             matcher = pattern.matcher(arr[i]);
             if (!matcher.find()) {
                 builder1.append(arr[i] + " ");
             }
         }

         String res = builder1.toString();
        //System.out.println(res);

        BufferedWriter secondFileWriter = new BufferedWriter(new FileWriter(secondFileName));

        secondFileWriter.write(res);

        firstFileReader.close();
        secondFileWriter.close();

    }
}
