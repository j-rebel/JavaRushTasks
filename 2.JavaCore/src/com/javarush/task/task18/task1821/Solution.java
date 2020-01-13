package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        //String path = "C:\\Users\\JRebel\\Desktop\\file.txt";
        String path = args[0];

        FileInputStream stream = new FileInputStream(path);

        TreeMap<Integer, Integer> uniqueValues = new TreeMap<>();
        ArrayList<Integer> allValues = new ArrayList<>();

        while (stream.available() > 0) {
            int data = stream.read();
            uniqueValues.put(data, 0);
            allValues.add(data);
        }



        /*for (Map.Entry<Integer, Integer> pair : uniqueValues.entrySet()) {
            int i = pair.getKey();
            char c = (char) i;
            System.out.println(c + " " + pair.getKey() + " - " + pair.getValue());
        }*/

        for (Integer i : allValues) {
            if (uniqueValues.containsKey(i)) {
                uniqueValues.put(i, uniqueValues.get(i) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> pair : uniqueValues.entrySet()) {
            int i = pair.getKey();
            char c = (char) i;
            System.out.println(c + /*" " +  i +*/ " " + pair.getValue());
        }

        stream.close();
    }
}
