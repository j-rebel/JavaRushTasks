package com.javarush.task.task16.task1630;

import javax.swing.text.AbstractDocument;
import java.io.*;

/*
* C:\Users\JRebel\Desktop\first.txt
* C:\Users\JRebel\Desktop\second.txt
* */

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }
    public static class ReadFileThread extends Thread implements ReadFileInterface{
        String fileName;

        String content = "";

        public void setFileName(String fullFileName){
            this.fileName = fullFileName;
        }
        public String getFileContent(){

            return content;
        }
        public void run(){
            try {
                File file = new File(fileName);

                BufferedReader reader = new BufferedReader(new FileReader(file));

                //BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
                String lineContent = "";
                while ((lineContent = reader.readLine()) != null){
                    content += lineContent + " ";
                }
                reader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }


    }
    //add your code here - добавьте код тут
}
