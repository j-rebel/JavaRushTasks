package com.javarush.task.task18.task1822;

/*
Поиск данных внутри файла
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {

        String pathFirst = getFileName();

        InputStreamReader firstIn = new InputStreamReader(new FileInputStream(pathFirst), "UTF-8");

        StringBuilder builder = new StringBuilder();

        while (firstIn.ready()) {
            builder.append((char) firstIn.read());
        }

        firstIn.close();

        String res = builder.toString();

        String[] resArr = res.split("\n");

        for (String s : resArr) {
            Pattern pattern = Pattern.compile(args[0] + " ");
            Matcher matcher = pattern.matcher(s);
            if (matcher.find()) {
                System.out.println(s);
            }
        }
    }

    public static String getFileName() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String res = reader.readLine();
        reader.close();
        return res;
    }
}