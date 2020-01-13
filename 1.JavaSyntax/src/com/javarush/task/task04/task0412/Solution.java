package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
       // while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String a = reader.readLine();
            int check = Integer.parseInt(a);
            if (check > 0) {
                System.out.println(check*2);
            }
            if (check < 0) {
                System.out.println(check + 1);
            }
            if (check == 0) {
                System.out.println(check);
            }
        //}

    }

}