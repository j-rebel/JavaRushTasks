package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file =  reader.readLine();

        FileReader fr = new FileReader(file);


        String s = "";

        while(fr.ready())
        {
            int read = fr.read();
            s += (char)read;

        }

        String [] str = s.split("\\W");
        int count = 0;

        for(int i=0;i<str.length;++i)
        {
            if(str[i].equals("world"))
            {
                ++count;
            }
        }

        System.out.println(count);

        reader.close();
        fr.close();

    }
}
