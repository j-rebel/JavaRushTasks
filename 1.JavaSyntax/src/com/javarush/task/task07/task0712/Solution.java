package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s);
        }

        int min = list.get(0).length();
        int minI = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < min) {
                min = list.get(i).length();
                minI = i;
            }
        }

        int max = list.get(0).length();
        int maxI = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > max) {
                max = list.get(i).length();
                maxI = i;
            }
        }

        if (maxI < minI) {
            System.out.println(list.get(maxI));
        } else {
            System.out.println(list.get(minI));
        }



    }

}
