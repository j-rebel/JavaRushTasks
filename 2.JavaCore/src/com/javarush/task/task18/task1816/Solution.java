package com.javarush.task.task18.task1816;

/* 
Английские буквы "C:\\Users\\JRebel\\Desktop\\file.txt"

package com.javarush.task.task18.task1816;

/*
Английские буквы "C:\\Users\\JRebel\\Desktop\\file.txt"


import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args)throws IOException {
        FileInputStream inp = new FileInputStream("C:\\Users\\JRebel\\Desktop\\file.txt");
        ArrayList<String> list = new ArrayList();
        int i = 0;
        while(inp.available()>0){
            list.add(String.valueOf((char)inp.read()));
        }
        inp.close();
        for(String s:list){
            if(s.matches("[a-z]")||s.matches("[A-Z]")){
                i++;
            }
        }
        System.out.print(i);
    }
}
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);

        //File file = new File("C:\\Users\\JRebel\\Desktop\\file.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        StringBuilder builder = new StringBuilder();
        while ((st = br.readLine()) != null) {
            builder.append(st);
        }

        String res = builder.toString();
        //System.out.println(res);

        int count = 0;
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        Matcher matcher = pattern.matcher(res);
        while (matcher.find()) {
            count++;
        }
        System.out.println(count);
        br.close();


    }
}
