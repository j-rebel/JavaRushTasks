package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> workers = new HashMap<String, Integer>();
        workers.put("Первый", 10);
        workers.put("Второй", 20);
        workers.put("Третий", 3000); // этот
        workers.put("Четвертый", 4000); // этот
        workers.put("Пятый", 500);
        workers.put("Шестой", 60);
        workers.put("Седьмой", 70);
        workers.put("Восьмой", 800); // этот
        workers.put("Девятый", 900); // этот
        workers.put("Десятый", 100);
        return workers;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            //получение «пары» элементов
            Map.Entry<String, Integer> pair = iterator.next();
            String key = pair.getKey();            //ключ
            Integer value = pair.getValue();        //значение
            if (value < 500) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> test = createMap();
        System.out.println(test);

       /* Map <String, Integer> test = createMap();
        Iterator<Map.Entry<String, Integer>> iterator = test.entrySet().iterator();
        for (Map.Entry<String, Integer> pair : test.entrySet())
        {
            String key = pair.getKey();                      //ключ
            int value = pair.getValue();                  //значение
            System.out.println(key + ":" + value);
        }
        removeItemFromMap(test);
        System.out.println();
        System.out.println();
        for (Map.Entry<String, Integer> pair : test.entrySet())
        {
            String key = pair.getKey();                      //ключ
            int value = pair.getValue();                  //значение
            System.out.println(key + ":" + value);
        }*/

    }
}