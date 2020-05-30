package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {

        String file1 = "C:\\Users\\JRebel\\Desktop\\file1.txt";
        String file2 = "C:\\Users\\JRebel\\Desktop\\file2.txt";

        BufferedReader reader1 = new BufferedReader(new FileReader(file1));
        BufferedReader reader2 = new BufferedReader(new FileReader(file2));

        ArrayList<String> original = new ArrayList<>();
        ArrayList<String> edited = new ArrayList<>();

        while (reader1.ready()) {
            original.add(reader1.readLine());
        }

        while (reader2.ready()) {
            edited.add(reader2.readLine());
        }

        for (String s : original) {
            System.out.println(s);
        }

        System.out.println();

        for (String s : edited) {
            System.out.println(s);
        }

        System.out.println();

        // как понять что строка удалена - текущие строки не совпадают, но следующая строка из оригинала = текущей в редакции
        // добавлена - текущие не совпадают + следующая из оригинала не совпадает

        for (int i = 0; i < 6; i++) {
            String o = original.get(i);
            String ed = edited.get(i);
            String oPlus = original.get(i + 1);

            if (!o.equals(ed) && !oPlus.equals(ed)) {
                lines.add(new LineItem(Type.REMOVED, o));
            } else if (!o.equals(ed)) {
                lines.add(new LineItem(Type.ADDED, ed));
            } else {
                lines.add(new LineItem(Type.SAME, o));
            }
        }

        for (LineItem item : lines) {
            System.out.println(item.type + item.line);
        }



        reader1.close();
        reader2.close();


    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
