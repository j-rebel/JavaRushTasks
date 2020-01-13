package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] res = new ArrayList[4];
        for (int i = 0; i < res.length; i++) {
            ArrayList<String> arr = new ArrayList<String>();
            for (int j = 0; j < 10; j++){
                String s = "элемент номер " + j;
                arr.add(j, s);
            }
            res[i] = arr;
        }
        return res;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}