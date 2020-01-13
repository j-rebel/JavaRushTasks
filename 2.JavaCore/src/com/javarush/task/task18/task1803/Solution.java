package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        //String fName = "C:\\Users\\JRebel\\Desktop\\file.txt";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream newStream = new FileInputStream(reader.readLine());

        HashMap<Integer, Integer> uniqueValues = new HashMap<>();
        ArrayList<Integer> allValues = new ArrayList<>();

        while (newStream.available() > 0) {
            int data = newStream.read();
            uniqueValues.put(data, 0);
            allValues.add(data);
        }

        for (int i = 0; i < allValues.size(); i++) {
            if (uniqueValues.containsKey(allValues.get(i))) {
                uniqueValues.put(allValues.get(i), uniqueValues.get(allValues.get(i)) + 1);
            }
        }

        int max = 0;

        for (Map.Entry<Integer, Integer> pair : uniqueValues.entrySet()) {
            if (pair.getValue() > max) {
                max = pair.getValue();
            }
        }

        for (Map.Entry<Integer, Integer> pair : uniqueValues.entrySet()) {
            if (pair.getValue() == max) {
                System.out.print(pair.getKey() + " ");
            }
        }

        newStream.close();
    }
}
