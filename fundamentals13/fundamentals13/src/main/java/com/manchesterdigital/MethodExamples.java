package com.manchesterdigital;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MethodExamples {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("//somepath");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Can you give me a valid file please mate?");
        }

        try {
            MethodExamples examples = new MethodExamples();
            examples.nap(99);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }


    } // end Main method

    /**
     *  modifier static return_value_methodName(0....* params) throws clauseException
     */

    public final void nap(final int minutes) throws IllegalArgumentException, IllegalStateException{
        // body
        if(minutes == 99){
            throw new IllegalArgumentException();
        }
    }
}
