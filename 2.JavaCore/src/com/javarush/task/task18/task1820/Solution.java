package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        /*String pathFirst = "C:\\Users\\JRebel\\Desktop\\file.txt";
        String pathSecond = "C:\\Users\\JRebel\\Desktop\\file2.txt";*/

        String pathFirst = getFileName();
        String pathSecond = getFileName();


        FileInputStream firstIn = new FileInputStream(pathFirst);
        FileOutputStream secondOut = new FileOutputStream(pathSecond);

        StringBuilder builder = new StringBuilder();

        while (firstIn.available() > 0) {
            builder.append((char) firstIn.read());
        }

        String doubleList = builder.toString().trim();
        //System.out.println(doubleList);

        String[] doubleArr = doubleList.split(" ");

        for (String s : doubleArr) {
            int i = (int) Math.round(Double.parseDouble(s));
            String res = i + " ";
            secondOut.write(res.getBytes());
        }

        firstIn.close();
        secondOut.close();

        /*
        3.49 => 3
        3.50 => 4
        3.51 => 4
        -3.49 => -3
        -3.50 => -3
        -3.51 => -4
        */

        /*System.out.println(Math.round(3.49));
        System.out.println(Math.round(3.50));
        System.out.println(Math.round(3.51));
        System.out.println(Math.round(-3.49));
        System.out.println(Math.round(-3.50));
        System.out.println(Math.round(-3.51));*/

    }

    public static String getFileName() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String res = reader.readLine();
        reader.close();
        return res;
    }
}
