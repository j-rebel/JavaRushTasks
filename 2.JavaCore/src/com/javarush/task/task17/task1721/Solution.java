package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {

        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));

        //String firstFilePath = "C:\\Users\\JRebel\\Desktop\\first.txt";
        //String secondFilePath = "C:\\Users\\JRebel\\Desktop\\second.txt";

        String firstFilePath = inputReader.readLine();
        String secondFilePath = inputReader.readLine();

        File fileFirst = new File(firstFilePath);
        File fileSecond = new File(secondFilePath);

        BufferedReader fileReaderFirst = new BufferedReader(new FileReader(fileFirst));
        String st;
        while ((st = fileReaderFirst.readLine()) != null) {
            allLines.add(st);
        }

        BufferedReader fileReaderSecond = new BufferedReader(new FileReader(fileSecond));

        String st2;
        while ((st2 = fileReaderSecond.readLine()) != null) {
            forRemoveLines.add(st2);
        }

        //System.out.println(allLines);
        //System.out.println(forRemoveLines);

        Solution s = new Solution();
        s.joinData();
        //forRemoveLines.removeAll(allLines);

        //System.out.println(allLines);
        //System.out.println(forRemoveLines);

        fileReaderSecond.close();
        fileReaderFirst.close();
        inputReader.close();

    }

    public void joinData() throws CorruptedDataException {
        List<String> copyAll = new ArrayList<String>();
        copyAll.addAll(allLines);

        List<String> copyForRemoval = new ArrayList<String>();
        copyForRemoval.addAll(forRemoveLines);

        copyForRemoval.removeAll(copyAll);

        if (copyForRemoval.isEmpty()) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
