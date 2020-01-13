package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/
//File file = new File("C:\\Users\\JRebel\\Desktop\\file.txt");
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        /*FileOutputStream first = new FileOutputStream("C:\\Users\\JRebel\\Desktop\\file.txt", true);
        FileInputStream second = new FileInputStream("C:\\Users\\JRebel\\Desktop\\file2.txt");
        FileInputStream third = new FileInputStream("C:\\Users\\JRebel\\Desktop\\file3.txt");*/

        /*String pathFirst = "C:\\Users\\JRebel\\Desktop\\file.txt";
        String pathSecond = "C:\\Users\\JRebel\\Desktop\\file2.txt";*/

        String pathFirst = getFileName();
        String pathSecond = getFileName();


        FileInputStream secondIn = new FileInputStream(pathSecond);
        FileInputStream firstIn = new FileInputStream(pathFirst);


        StringBuilder builder = new StringBuilder();

        while (secondIn.available() > 0) {
            builder.append((char) secondIn.read());
        }

        //System.out.println(builder.toString());

        while (firstIn.available() > 0) {
            builder.append((char) firstIn.read());
        }

        //System.out.println(builder.toString());

        String firstRes = builder.toString();
        System.out.println(firstRes);

        FileOutputStream firstOut = new FileOutputStream(pathFirst);

        firstOut.write(firstRes.getBytes());


        firstOut.close();
        secondIn.close();
        firstIn.close();

    }

    public static String getFileName() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String res = reader.readLine();
        reader.close();
        return res;
    }
}
