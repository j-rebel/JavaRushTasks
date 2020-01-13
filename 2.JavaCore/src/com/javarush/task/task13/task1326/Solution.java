package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла

"C:\\Users\\JRebel\\Desktop\\fuck.txt
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        InputStream inputStream = null;
        BufferedInputStream buffer = null;

        try {
            BufferedReader pathReader = new BufferedReader(new InputStreamReader(System.in));

            inputStream = new FileInputStream(pathReader.readLine());

            buffer = new BufferedInputStream(inputStream);

            BufferedReader reader = new BufferedReader(new InputStreamReader(buffer));

            String line;
            ArrayList<Integer> intArr = new ArrayList<Integer>();
            while((line = reader.readLine()) != null){
                int check = Integer.parseInt(line);
                intArr.add(check);
            }
            reader.close();

            Collections.sort(intArr);
            for (int check : intArr) {
                if (check % 2 == 0) {
                    System.out.println(check);
                }

            }


        } catch(Exception e) {

            e.printStackTrace();

        } finally {

            inputStream.close();
            buffer.close();

        }
    }

}
