package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл C:\\Users\\JRebel\\Desktop\\file.txt.part2
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        TreeMap<Integer, FileFragment> fragmentMap = new TreeMap<>();

        String input = "";

        while (true) {

            input = reader.readLine();

            if ("end".equals(input)) {break;}

            FileFragment ff = new FileFragment(input);

            fragmentMap.put(Integer.parseInt(ff.getPartId()), ff);

        }

        reader.close();

        for (Map.Entry<Integer, FileFragment> pair : fragmentMap.entrySet()) {

            FileInputStream inputStream = new FileInputStream(pair.getValue().getOriginalLink());
            FileOutputStream outputStream = new FileOutputStream(pair.getValue().getResultFilePath(), true);

            byte[] buffer = new byte[1000];

            while (inputStream.available() > 0)
            {
                int count = inputStream.read(buffer);
                outputStream.write(buffer, 0, count);
            }

            inputStream.close();
            outputStream.close();
        }
    }
}
