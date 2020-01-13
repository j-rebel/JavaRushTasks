package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());

        if (x < 0 || y < 0) {
            throw new Exception();
        } else {
            findDivisor(x, y);
        }
    }

    private static void findDivisor (int x, int y) {
        if (x < y) {
            int temp = x;
            x = y;
            y = temp;
        }

        if (x % y == 0) {
            System.out.println(y);
        } else {
            findDivisor(y, x - y);
        }
    }
    }
