package com.javarush.task.task17.task1707;


import com.sun.org.apache.xpath.internal.operations.String;

public class IMF {

    private static IMF imf;

    public static IMF getFund() {
        //add your code here - добавь код тут
        synchronized (IMF.class) {
            if (imf == null)
                imf = new IMF();
            else return imf;

            return imf;
        }

    }

    private IMF() {
    }
}
