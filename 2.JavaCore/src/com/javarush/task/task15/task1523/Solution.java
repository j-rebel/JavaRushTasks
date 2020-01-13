package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {

    private String name;
    private int value;
    private boolean bool;
    private char c;


    private Solution(String name) {
        System.out.println("Private");
    }

    protected Solution(int value) {
        System.out.println("Protected");
    }

    Solution(boolean bool) {
        System.out.println("Package");
    }

    public Solution(char c) {
        System.out.println("Public");
    }


    public static void main(String[] args) {

    }
}

