package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String firstFile = reader.readLine();
        String secondFile = reader.readLine();

        BufferedReader fileReader = new BufferedReader(new FileReader(firstFile));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(secondFile));

        while (fileReader.ready()) {

            String tmp = fileReader.readLine().replaceAll("\\p{Punct}", "").replaceAll("\\n", "");
            fileWriter.write(tmp);

        }

        fileWriter.close();
        fileReader.close();
        reader.close();

    }
}
