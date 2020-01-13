package com.javarush.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";
    private FileOutputStream stream;

    public AmigoOutputStream(FileOutputStream stream) throws FileNotFoundException {
        super(fileName);
        this.stream = stream;
    }

    public void flush() throws IOException{
        stream.flush();
    }

    public void write(int b) throws IOException{
        stream.write(b);
    }

    public void write(byte[] b) throws IOException{
        stream.write(b);
    }

    public void write(byte[] b, int off, int len) throws IOException{
        stream.write(b, off, len);
    }

    public void close() throws IOException{
        stream.flush();
        String s = "JavaRush © All rights reserved.";
        stream.write(s.getBytes());
        stream.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
