package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {

    static {
        Solution.readKeyFromConsoleAndInitPlanet();
    }

    public static void main(String[] args) {
        /*if (thePlanet instanceof Earth) {
            System.out.println("Earth");
        } else if (thePlanet instanceof Moon) {
            System.out.println("Moon");
        } else if (thePlanet instanceof Sun) {
            System.out.println("Sun");
        } else if (thePlanet == null) {
            System.out.println("NULL");
        }*/

    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() {
        // implement step #5 here - реализуйте задание №5 тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String input = reader.readLine();
            if (input.equals(Planet.EARTH)) {
                thePlanet = Earth.getInstance();
            } else if (input.equals(Planet.MOON)) {
                thePlanet = Moon.getInstance();
            } else if (input.equals(Planet.SUN)) {
                thePlanet = Sun.getInstance();
            } else {
                thePlanet = null;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
