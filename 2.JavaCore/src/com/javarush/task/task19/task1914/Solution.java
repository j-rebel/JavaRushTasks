package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream consoleStream = System.out;

        //Создаем динамический массив
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        //создаем адаптер к классу PrintStream
        PrintStream stream = new PrintStream(outputStream);
        //Устанавливаем его как текущий System.out
        System.setOut(stream);

        //Вызываем функцию, которая ничего не знает о наших манипуляциях
        testString.printSomething();

        //Преобразовываем записанные в наш ByteArray данные в строку
        String result = outputStream.toString();

        //Возвращаем все как было
        System.setOut(consoleStream);

        result = result.replaceAll(" = ", "");
        result = result.replaceAll("\\r", "");
        result = result.replaceAll("\\n", "");

        String firstNumString = result.substring(0, result.indexOf(" "));
        int firstNum = Integer.parseInt(firstNumString);
        String operation = result.substring(result.indexOf(firstNumString) + firstNumString.length() + 1, firstNumString.length() + 2);
        String secondNumString = result.substring(result.indexOf(operation) + 2);
        int secondNum = Integer.parseInt(secondNumString);
        int common = 0;

        switch (operation) {
            case "+":
                common = firstNum + secondNum;
                break;
            case "*":
                common = firstNum * secondNum;
                break;
            case "-":
                common = firstNum - secondNum;
                break;
        }

        StringBuilder builder = new StringBuilder();
        builder.append(result).append(" = ").append(common);
        result = builder.toString();

        System.out.println(result);

        /*String result = "3 + 6 = ";

        result = result.replaceAll(" = ", "");
        result = result.replaceAll("\\n", "");

        String firstNumString = result.substring(0, result.indexOf(" "));
        int firstNum = Integer.parseInt(firstNumString);
        String operation = result.substring(result.indexOf(firstNumString) + firstNumString.length() + 1, firstNumString.length() + 2);
        String secondNumString = result.substring(result.indexOf(operation) + 2, result.length());
        int secondNum = Integer.parseInt(secondNumString);*/


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

