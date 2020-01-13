package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String [] weekIndex = {"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};
        //while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String input = reader.readLine();
            int inputInt = Integer.parseInt(input);
            if (inputInt > 7 || inputInt < 1) {
                System.out.println("такого дня недели не существует");
            } else {
                System.out.println(weekIndex[inputInt - 1]);
            }
        //}

    }
}