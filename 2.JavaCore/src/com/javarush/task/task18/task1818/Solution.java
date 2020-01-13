package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

//File file = new File("C:\\Users\\JRebel\\Desktop\\file.txt");
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        /*FileOutputStream first = new FileOutputStream("C:\\Users\\JRebel\\Desktop\\file.txt", true);
        FileInputStream second = new FileInputStream("C:\\Users\\JRebel\\Desktop\\file2.txt");
        FileInputStream third = new FileInputStream("C:\\Users\\JRebel\\Desktop\\file3.txt");*/

        FileOutputStream first = new FileOutputStream(getFileName(), true);
        FileInputStream second = new FileInputStream(getFileName());
        FileInputStream third = new FileInputStream(getFileName());

        byte[] buffer = new byte[1000];

        while (second.available() > 0) //пока есть еще непрочитанные байты
        {
            // прочитать очередной блок байт в переменную buffer и реальное количество в count
            int count = second.read(buffer);
            first.write(buffer, 0, count); //записать блок(часть блока) во второй поток
        }

        while (third.available() > 0) //пока есть еще непрочитанные байты
        {
            // прочитать очередной блок байт в переменную buffer и реальное количество в count
            int count = third.read(buffer);
            first.write(buffer, 0, count); //записать блок(часть блока) во второй поток
        }

        first.close();
        second.close();
        third.close();

    }

    public static String getFileName() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String res = reader.readLine();
        reader.close();
        return res;
    }
}
