package com.javarush.task.task14.task1419;

import javax.xml.transform.SourceLocator;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] a = new int[] {0, 1};
            a[2] = 2;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Class.forName("org.sqlite.JDBC");

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Scanner scores = new Scanner(new File("scores.dat"));

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String a = null; //null value
            System.out.println(a.charAt(0));

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String a = "This is like chipping "; // length is 22
            char c = a.charAt(24); // accessing 25th element
            System.out.println(c);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            // "akki" is not a number
            int num = Integer.parseInt ("akki") ;

            System.out.println(num);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new IOException();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new InterruptedException();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new NoSuchFieldException();
        } catch (Exception e) {
            exceptions.add(e);
        }



        //напишите тут ваш код new File("scores.dat")

    }
}
