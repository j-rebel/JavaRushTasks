package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String pathFrom = reader.readLine();
        String pathTo = reader.readLine();

        FileInputStream from = new FileInputStream(pathFrom);
        FileOutputStream to = new FileOutputStream(pathTo);

        byte[] buffer = new byte[from.available()];

        from.read(buffer);

        for (int i = buffer.length - 1; i >= 0; i--) {
            to.write(buffer[i]);
        }

        from.close();
        to.close();
    }
}
