package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix() {
        System.out.println("методы потерялись");
    }

    public static void printMatrix(String a, String b) {
        System.out.println(a + b);
    }

    public static void printMatrix(Object o) {
        System.out.println(o.getClass().getSimpleName());
    }

    public static void printMatrix(char a, char b, char c) {
        char[] charArr = new char[]{a, b, c};
        String s = new String(charArr);
        System.out.println(s);
    }

    public static void printMatrix(int a, int b, int c, int d) {
        System.out.println(a * b + c * d);
    }

    public static void printMatrix(short s) {
        System.out.println(s);
    }

    public static void printMatrix(byte b) {
        System.out.println(b);
    }

    public static void printMatrix(double d) {
        System.out.println(d);
    }


}
