package com.javarush.task.task19.task1918;

import java.io.*;
import java.util.ArrayList;


/* 
Знакомство с тегами
*/

public class Solution {
   
    public static void main(String[] args) {
        String fileData = "";

        String fileName = "";
        BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            fileName = fileNameReader.readLine();
            fileNameReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedReader reader = null;
        StringBuilder builder = new StringBuilder();
        String temp = "";
        try {
            reader = new BufferedReader(new FileReader(new File(fileName)));

        while ((temp = reader.readLine()) != null) {
                builder.append(temp);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        fileData = builder.toString();

        printListByTag(fileData, args[0]);
    }

    public static void printListByTag (String input, String tag) {
        input = input.replaceAll("\n", "");
        input = input.replaceAll("\r", "");

        String startTagWithoutClose = tag.substring(0, tag.length() - 1);
        String endTag = "</" + tag.substring(1);

        String[] arr = input.split(startTagWithoutClose);
        ArrayList<String> str = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains(endTag) || arr[i + 1].startsWith(">")) {
                if(!arr[i].contains(endTag)) {
                    str.add(startTagWithoutClose + arr[i] + startTagWithoutClose + arr[i + 1]);
                    i++;
                } else {
                    str.add(startTagWithoutClose + arr[i]);
                }
            }
        }

        for (String s : str) {
            System.out.println(s);
        }
    }

}