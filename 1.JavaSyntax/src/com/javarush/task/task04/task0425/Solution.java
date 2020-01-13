package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;
import java.util.*;

public class Solution {

   /* public static int getQuater(int x, int y) {
        int res = 0;
        if (x > 0 & y > 0) {res = 1;}
        if (x > 0 & y < 0) {res = 2;}
        if (x < 0 & y < 0) {res = 4;}
        if (x < 0 & y > 0) {res = 3;}
        return res;
    }*/


    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
       // while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String inputX = reader.readLine();
            int x = Integer.parseInt(inputX);
            //BufferedReader readerY = new BufferedReader(new InputStreamReader(System.in));
            String inputY = reader.readLine();
            int y = Integer.parseInt(inputY);
            //System.out.println(getQuater(x, y));
        int res = 0;
        if (x > 0 && y > 0) {res = 1;}
        if (x > 0 && y < 0) {res = 4;}
        if (x < 0 && y < 0) {res = 3;}
        if (x < 0 && y > 0) {res = 2;}
        if (res != 0) {
            System.out.println(res);
        }
        }
   // }


}
