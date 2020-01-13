package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ExecutionException;

/* 
CRUD
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static Date formatInputDate(String dateToFormat) {
        Date date = new Date();
        try {
            SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            date = inputFormat.parse(dateToFormat);
        } catch (ParseException e) {
            System.out.println("Parsing fucked up");
        }
        return date;
    }

    public static String formatOutputDate(int index) {
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        Date outputDate = allPeople.get(index).getBirthDate();
        String dateToFormat = outputFormat.format(outputDate);
        return dateToFormat;
    }

    //static String[] args = new String[] {};


    public static void main(String[] args) {
        //start here - начни тут

        if (args.length > 0) {

            switch (args[0]) {
                case ("-c"):

                    if (args[2].equals("м")) {
                        allPeople.add(Person.createMale(args[1], formatInputDate(args[3])));
                        //System.out.println("Created Male, args - " + Arrays.toString(args));
                    } else {
                        allPeople.add(Person.createFemale(args[1], formatInputDate(args[3])));
                        //System.out.println("Created Female, args - " + Arrays.toString(args));
                    }
                    System.out.println(allPeople.size() - 1);
                    break;

                case ("-u"):
                    allPeople.get(Integer.parseInt(args[1])).setName(args[2]);
                    allPeople.get(Integer.parseInt(args[1])).setSex(args[3].equals("м") ? Sex.MALE : Sex.FEMALE);
                    allPeople.get(Integer.parseInt(args[1])).setBirthDate(formatInputDate(args[4]));
                    //System.out.println("Updated, args - " + Arrays.toString(args));
                    break;

                case ("-d"):
                    int index = Integer.parseInt(args[1]);
                    allPeople.get(index).setName(null);
                    allPeople.get(index).setSex(null);
                    allPeople.get(index).setBirthDate(null);
                    //allPeople.remove();
                    //System.out.println("Deleted, args - " + Arrays.toString(args));
                    break;

                case ("-i"):

                    Person person = allPeople.get(Integer.parseInt(args[1]));

                    String name = person.getName();
                    String sex = person.getSex().equals(Sex.MALE) ? "м" : "ж";
                    String bdate = formatOutputDate(Integer.parseInt(args[1]));

                    System.out.println(name + " " + sex + " " + bdate);
                    //System.out.println("Get info, args - " + Arrays.toString(args));
                    break;
            }


        }
    }


    }

