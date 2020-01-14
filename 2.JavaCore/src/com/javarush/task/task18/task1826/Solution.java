package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        String filePath = args[1];
        String outputPath = args[2];

        switch (args[0]) {
            case "-e":
                encode(filePath, outputPath);
                break;
            case "-d":
                decode(filePath, outputPath);
                break;
        }

    }

    public static void encode(String filePath, String outputPath) throws IOException {

        FileInputStream inputStream = new FileInputStream(filePath);
        FileOutputStream outputStream = new FileOutputStream(outputPath);

        while (inputStream.available() > 0)
        {
            int data = inputStream.read() + 1;
            outputStream.write(data);
        }

        inputStream.close();
        outputStream.close();
    }

    public static void decode(String filePath, String outputPath) throws IOException {

        FileInputStream inputStream = new FileInputStream(filePath);
        FileOutputStream outputStream = new FileOutputStream(outputPath);

        while (inputStream.available() > 0)
        {
            int data = inputStream.read() - 1;
            outputStream.write(data);
        }

        inputStream.close();
        outputStream.close();
    }
}
