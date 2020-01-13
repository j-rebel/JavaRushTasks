package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        //while (true) {
        int vis = 366;
        int ne_vis = 365;
        int god; //- данные ввода,vis = 366,ne_vis = 365;
        Scanner src = new Scanner(System.in);
        god = src.nextInt(); //- перемещение данных после ввода

        if(god%400 == 0){ //- если кратно 400 вывод,если нет инструкция ниже
            System.out.println("количество дней в году: " + vis);
        }else if (god%100 == 0){ //----если кратно 100 вывод,если нет инструкция ниже
            System.out.println("количество дней в году: " + ne_vis);
        }else if (god%4 == 0){  //-----если кратно 4 вывод,если нет инструкция ниже
            System.out.println("количество дней в году: " + vis);
        }else //--- Как указано в инструкции "Все остальное"
        System.out.println("количество дней в году: " + ne_vis);

        //}
    }
}