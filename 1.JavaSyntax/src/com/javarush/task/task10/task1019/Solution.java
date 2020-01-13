package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        while (true) {
                int id;
                try {
                    id = Integer.parseInt(reader.readLine());
                    String name = reader.readLine();

                    map.put(name, id);

                    if (name.equals("")) {break;}

                } catch (Exception e) {
                    break;
                }

        }

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String k = pair.getKey();
            int v = pair.getValue();
            System.out.println(v + " " + k);
        }

        //System.out.println("Id=" + id + " Name=" + name);
    }
}
