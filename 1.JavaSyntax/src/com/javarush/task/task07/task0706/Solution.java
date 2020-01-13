package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {

    static int oddQty;
    static  int evenQty;


    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int[] nums = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < nums.length; i++) {
            String s = reader.readLine();
            nums[i] = Integer.parseInt(s);
            if (i == 0 || i % 2 == 0) {
                evenQty += nums[i];
            } else {
                oddQty += nums[i];
            }
        }

        //System.out.println("Even sum: " + evenQty + " Odd sum: " + oddQty);

       if (evenQty > oddQty) {
           System.out.println("В домах с четными номерами проживает больше жителей.");
       } else {
           System.out.println("В домах с нечетными номерами проживает больше жителей.");
       }
    }
}
