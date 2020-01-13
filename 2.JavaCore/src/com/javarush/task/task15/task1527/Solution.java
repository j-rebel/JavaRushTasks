package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        //add your code here
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String input = reader.readLine();
            URL url = new URL(input);

            Map<String, String> query_pairs = new LinkedHashMap<String, String>();
            String query = url.getQuery();
            String[] pairs = query.split("&");
            for (String pair : pairs) {
                int idx = pair.indexOf("=");
                try {
                    query_pairs.put(URLDecoder.decode(pair.substring(0, idx), "UTF-8"), URLDecoder.decode(pair.substring(idx + 1), "UTF-8"));
                } catch (StringIndexOutOfBoundsException e) {
                    query_pairs.put(URLDecoder.decode(pair, "UTF-8"), null);
                }
            }

            for (Map.Entry entry : query_pairs.entrySet()) {
                System.out.print(entry.getKey() + " ");
            }

            System.out.println();

            for (Map.Entry entry : query_pairs.entrySet()) {
                if (entry.getKey().equals("obj")) {
                    try {
                        double d = Double.parseDouble(entry.getValue().toString());
                        alert(d);
                    } catch (NumberFormatException e) {
                        alert(entry.getValue().toString());
                    } catch (NullPointerException e) {
                        String s = null;
                        alert(s);
                    }
                }
            }




        } catch (IOException e) {
            System.out.println("fucked up IO");
        }



    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
