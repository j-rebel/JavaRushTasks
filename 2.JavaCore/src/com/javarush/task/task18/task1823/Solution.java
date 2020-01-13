package com.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Нити и байты
*/

//String path = "C:\\Users\\JRebel\\Desktop\\file.txt";

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = "";

        while (true) {

            input = reader.readLine();

            if ("exit".equals(input)) {break;}

            ReadThread thread = new ReadThread(input);
            thread.start();
            thread.interrupt();

        }

        reader.close();

        /*for (Map.Entry<String, Integer> pair : resultMap.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }*/
    }

    public static class ReadThread extends Thread {

        //private TreeMap<String, Integer> resultMap = new TreeMap<>();
        private String fileName;
        private FileInputStream fis;

        public ReadThread(String fileName) throws IOException {
            //implement constructor body
            this.fileName = fileName;
            //this.resultMap.put(fileName, 0);
            this.fis = new FileInputStream(fileName);
        }
        // implement file reading here - реализуйте чтение из файла тут

        public void run() {

            HashMap<Integer, Integer> valuesCount = new HashMap<>();

            try {

                while (this.fis.available() > 0) {
                    int check = fis.read();
                    if (valuesCount.containsKey(check)) {
                        valuesCount.put(check, valuesCount.get(check) + 1);
                    } else {
                        valuesCount.put(check, 0);
                    }
                }

                int max = 0;
                int searchedCode = 0;

                for (Map.Entry<Integer, Integer> pair : valuesCount.entrySet()) {
                    if (pair.getValue() > max) {
                        max = pair.getValue();
                        searchedCode = pair.getKey();
                    }
                }

                resultMap.put(this.fileName, searchedCode);

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                this.fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
