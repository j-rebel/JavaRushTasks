/*package com.javarush.task.task18.task1808;

*//*
Разделение файла
*//*

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        //String fName = "C:\\Users\\JRebel\\Desktop\\file.txt";

        //System.out.println(5 / 2);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream original = new FileInputStream(reader.readLine());
        FileOutputStream first = new FileOutputStream(reader.readLine());
        FileOutputStream second = new FileOutputStream(reader.readLine());

        *//*FileInputStream original = new FileInputStream("C:\\Users\\JRebel\\Desktop\\file.txt");
        FileOutputStream first = new FileOutputStream("C:\\Users\\JRebel\\Desktop\\file2.txt");
        FileOutputStream second = new FileOutputStream("C:\\Users\\JRebel\\Desktop\\file3.txt");*//*

        byte[] buffer = new byte[original.available()];

        original.read(buffer);

        int half1 = buffer.length / 2;
        int half2 = buffer.length - half1;

        first.write(buffer, 0, half1);
        second.write(buffer, half1, half2);

        original.close();
        first.close();
        second.close();
    }
}*/


package com.javarush.task.task18.task1808;
        import java.io.*;
/*
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String path1=reader.readLine();
        String path2=reader.readLine();
        String path3=reader.readLine();
        reader.close();

        FileInputStream fis1=new FileInputStream(path1);
        FileOutputStream fos2=new FileOutputStream(path2);
        FileOutputStream fos3=new FileOutputStream(path3);

        int len=fis1.available();
        byte[] buffer=new byte[len];
        fis1.read(buffer);
        if(len%2==1) {
            fos2.write(buffer, 0, (len/2+1));
            fos3.write(buffer, (len/2+1), (len/2));
        }
        else
        {
            fos2.write(buffer,0,(len/2));
            fos3.write(buffer,(len/2),(len/2));
        }
        fis1.close();
        fos2.close();
        fos3.close();
    }
}
