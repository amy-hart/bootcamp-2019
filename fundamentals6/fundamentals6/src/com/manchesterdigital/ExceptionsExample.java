package com.manchesterdigital;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* This is an example of a checked exception, because the compiler cries if you don't include
a try catch for the FileInputStream */
public class ExceptionsExample {
    public static void main(String[] args) {
        // Allows you to read from a file
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("Z://myfile.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
