package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        //while (true) {
            BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
            String s = t.readLine();
            double td = Double.parseDouble(s);
            int i = (int) Math.floor(td);
            double check = i % 5;
            /*System.out.println(s);
            System.out.println(d);
            System.out.println(i);*/
            if (check >= 3 && check < 4) {
                System.out.println("желтый");
            }
            else if (check >= 4 && check < 5) {
                System.out.println("красный");
            } else {
                System.out.println("зеленый");
            }
        //}
    }
}