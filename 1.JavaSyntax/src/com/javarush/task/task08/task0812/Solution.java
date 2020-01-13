package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
       /* List<Integer> ar = new ArrayList<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            ar.add(Integer.parseInt(reader.readLine()));
        }

        int max = 0;
        int temp = 0;
        for (int i = 0; i < ar.size()-1; i++) {

            if (ar.get(i).equals(ar.get(i + 1))) {
                temp++;
            } else if (temp > max) {
                max = temp;
                temp = 0;
            }
            //System.out.println("temp = " + temp);
            //System.out.println("max = " + max);
        }

            if (temp > max) {
                max = temp + 1;
                System.out.println(max);
            } else if (max > 0){
                System.out.println(max + 1);
            } else { }*/

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arr = new ArrayList<>();
        int result = 1, count = 1;
        for (int i = 0; i < 10; i++) {
            arr.add(Integer.valueOf(reader.readLine()));
        }
        int prev = arr.get(0);

        for (int i = 1; i < 10; i++) {
            if (arr.get(i) == prev) {
                count++;
                if (count > result) {
                    result = count;
                }
            }
            else {
                count = 1;
            }
            prev = arr.get(i);
        }


        System.out.println(result);
    }
}

