/*package com.javarush.task.task18.task1817;

/* 
Пробелы
*/
/*
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {

        //File file = new File(args[0]);
        //File file = new File("C:\\Users\\JRebel\\Desktop\\file.txt");

        //String input = buildStringFromInput("C:\\Users\\JRebel\\Desktop\\file.txt");
        String input = args[0];
        /*if (args.length > 0) {
            input = args[0];*/
/*

            if (!input.equals("")) {

                int a = symbolsCounter(input, ".");
                //System.out.println(a);
                int b = symbolsCounter(input, "\\s");
                //System.out.println(b);
                System.out.println(countProportion(a, b));
            }
        //}
    }

    public static int symbolsCounter(String check, String symbols) {
        int count = 0;

        Pattern pattern = Pattern.compile(symbols);
        Matcher matcher = pattern.matcher(check);

        while (matcher.find()) {
            count++;
        }

        return count;
    }

    public static String buildStringFromInput(String fileName) throws IOException {
        //FileInputStream inputStream = new FileInputStream(fileName);
        File file = new File(fileName);
        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder builder = new StringBuilder();

        String s;
        while ((s = br.readLine()) != null) {
            builder.append(s);
        }

        String res = builder.toString();

        br.close();
        return res;
    }

    public static float countProportion(int all, int part) {

        double d = (part * 0.1) / (all * 0.1) * 100;
        long round = Math.round(d);
        return (float) round / 100;

    }


}
*/

package com.javarush.task.task18.task1817;

        import java.io.FileInputStream;
        import java.io.FileNotFoundException;
        import java.io.IOException;
        import java.text.DecimalFormat;

public class Solution {
    public static void main(String[] args) throws IOException {
        String pattern = "##0.00";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        //System.out.println(args[0]);
        byte [] b = new byte[fileInputStream.available()];
        fileInputStream.read(b);
        //System.out.println(b);
        fileInputStream.close();
        int space = 0;
        for (int i = 0; i < b.length; i++) {
            if(b[i]==32)space++;
        }

        System.out.println(decimalFormat.format((double)(space*100)/b.length));


    }
}
