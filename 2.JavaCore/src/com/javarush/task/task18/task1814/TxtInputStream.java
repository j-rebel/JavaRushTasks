package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {

    public TxtInputStream(String fileName) throws IOException, UnsupportedFileNameException {
        super(fileName);
        String[] check = fileName.split("\\.");
        if (!"txt".equals(check[check.length - 1])) {
            super.close();
            throw new UnsupportedFileNameException();
        }

    }

    public static void main(String[] args) throws IOException, UnsupportedFileNameException {
        //new TxtInputStream("C:\\Users\\JRebel\\Desktop\\file.docx");
        /*String s = "C:\\Users\\JRebel\\Desktop\\file.txt";
        String[] check = s.split("\\.");
        System.out.println(check.length);
        for (String f : check) {
            System.out.println(f);
        }*/

    }
}

