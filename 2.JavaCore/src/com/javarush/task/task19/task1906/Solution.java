package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in));

        String firstFileName = fileNameReader.readLine();
        String secondFileName = fileNameReader.readLine();

        fileNameReader.close();

        FileReader firstFileReader = new FileReader(firstFileName);

        ArrayList<Integer> charList = new ArrayList<>();

        while (firstFileReader.ready()) {
            int data = firstFileReader.read();
            charList.add(data);
        }

        firstFileReader.close();

        FileWriter secondFileWriter = new FileWriter(secondFileName);

        for (int i = 0; i < charList.size(); i++) {

            if ((i + 1) % 2 == 0 )
            secondFileWriter.write(charList.get(i));

        }

        secondFileWriter.close();

    }
}
