package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        String id = args[1].trim();
        FileReader readerFile = new FileReader(fileName);
        BufferedReader fileReader = new BufferedReader(readerFile);

        FileWriter writer = new FileWriter(fileName, false);

        if (args[0].equals("-u") && args.length > 2) {
            String productName = args[2].trim();
            String price = args[3].trim();
            String quantity = args[4].trim();

            String s;
            ArrayList<String> list = new ArrayList<>();
            while ((s = fileReader.readLine()) != null) {
                if (id.equals(s.substring(0, 8).trim())) {
                    String temp = String.format("%-8s%-30s%-8s%-4s", id, productName, price, quantity);
                    list.add(temp);
                } else {
                    list.add(s);
                }
            }
            readerFile.close();
            fileReader.close();

            writer.write("");
            for (String str : list) {
                writer.append(str);
                writer.append("\n");
            }
            writer.close();
        } else {
            String s;
            ArrayList<String> list = new ArrayList<>();
            while ((s = fileReader.readLine()) != null) {
                if (id.equals((s.substring(0, 8).trim()))) {

                } else {
                    list.add(s);
                }
            }
            readerFile.close();
            fileReader.close();

            writer.write("");
            for (String str : list) {
                writer.append(str);
                writer.append("\n");
            }
            writer.close();
        }
    }
}
