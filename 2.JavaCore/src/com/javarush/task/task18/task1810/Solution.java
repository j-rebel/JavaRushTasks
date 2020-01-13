package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean isExit = false;

        while (!isExit) {

            String pathFrom = reader.readLine();

            FileInputStream from = new FileInputStream(pathFrom);

            if (from.available() < 1000) {
                //reader.close();
                from.close();
                isExit = true;
                throw new DownloadException();
            }
        }

    }

    public static class DownloadException extends Exception {

    }
}
