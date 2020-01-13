package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

/* 
Писатель в файл с консоли C:\Users\JRebel\Desktop\fuck.txt
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()))) {
            String text;
            while (true){
                text = reader.readLine();
                writer.write(text + "\n");
                writer.flush();
                if (text.equals("exit"))
                    break;
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        /*BufferedReader readPath = new BufferedReader(new InputStreamReader(System.in));
        String filePath = readPath.readLine();

        BufferedReader readLines = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String s = readLines.readLine();
            list.add(s);
            if (s.equals("exit")) {readLines.close(); break;}
        }

        readPath.close();

            File file = new File(filePath);
            FileWriter fileReader = new FileWriter(file); // поток который подключается к текстовому файлу
            BufferedWriter bufferedWriter = new BufferedWriter(fileReader); // соединяем FileWriter с BufferedWriter

            for(String s : list) {
                bufferedWriter.write(s + "\n");
            }

            bufferedWriter.close();

            FileReader fileReader2 = new FileReader(file); // поток который подключается к текстовому файлу
            BufferedReader bufferedReader = new BufferedReader(fileReader2); // соединяем FileReader с BufferedReader

            String line;
            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line); // выводим содержимое файла на экран построчно
            }

         bufferedReader.close();
             // закрываем поток*/

    }
}