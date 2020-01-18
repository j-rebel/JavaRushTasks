package com.javarush.task.task19.task1904;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws IOException, ParseException {

        /*PersonScannerAdapter psa = new PersonScannerAdapter(new Scanner(new File("C:\\Users\\JRebel\\Desktop\\file.txt")));

        System.out.println(psa.read());
        System.out.println(psa.read());*/


    }

    public static class PersonScannerAdapter implements PersonScanner {

        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException, ParseException {
            String s = this.fileScanner.nextLine();

            String[] arr = s.split(" ");

            String date = String.format("%s-%s-%s", arr[5], arr[4], arr[3]);
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
            Date parsedDate = sf.parse(date);

            return new Person(arr[1], arr[2], arr[0], parsedDate);
        }

        @Override
        public void close() throws IOException {
            this.fileScanner.close();
        }
    }
}
