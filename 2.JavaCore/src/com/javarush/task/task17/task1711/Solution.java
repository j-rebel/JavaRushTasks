package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {

        SimpleDateFormat newPersondb = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat outPersondb = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    for (int step = 1; step < args.length; step += 3) {
                        if (args[step + 1].equals("м")) {
                            try {
                                allPeople.add(Person.createMale(args[step], newPersondb.parse(args[step + 2])));
                            } catch (ParseException e) {
                                e.printStackTrace();
                            }
                        }
                        if (args[step + 1].equals("ж")) {
                            try {
                                allPeople.add(Person.createFemale(args[step], newPersondb.parse(args[step + 2])));
                            } catch (ParseException e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.println(allPeople.size() - 1);
                    }
                }
                break;
            case "-u":
                synchronized (allPeople) {
                    for (int step = 1; step < args.length; step += 4) {
                        int id = Integer.parseInt(args[step]);
                        allPeople.get(id).setName(args[step + 1]);
                        if (args[step + 2].equals("м")) {
                            allPeople.get(id).setSex(Sex.MALE);
                        } else
                            allPeople.get(id).setSex(Sex.FEMALE);
                        try {
                            allPeople.get(id).setBirthDate(newPersondb.parse(args[step + 3]));
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                    }
                }
                break;
            case "-d":
                synchronized (allPeople) {
                    for (int step = 1; step < args.length; step++) {
                        int id_d = Integer.parseInt(args[step]);
                        allPeople.get(id_d).setName(null);
                        allPeople.get(id_d).setSex(null);
                        allPeople.get(id_d).setBirthDate(null);
                    }
                }
                break;
            case "-i":
                synchronized (allPeople) {
                    for (int step = 1; step < args.length; step++) {
                        int id_i = Integer.parseInt(args[step]);
                        if (allPeople.get(id_i).getSex() == Sex.MALE)
                            System.out.println(allPeople.get(id_i).getName() + " м " + outPersondb.format(allPeople.get(id_i).getBirthDate()));
                        else
                            System.out.println(allPeople.get(id_i).getName() + " ж " + outPersondb.format(allPeople.get(id_i).getBirthDate()));
                    }
                }
                break;
            default: synchronized (allPeople) {
                break;
            }
        }
    }
}
