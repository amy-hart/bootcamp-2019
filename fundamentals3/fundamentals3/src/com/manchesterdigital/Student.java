package com.manchesterdigital;

public class Student {
    // final keyword is like constant in JS
    // constants are written in uppercase and words are separated by underscores, try to use full words
    // constants are usually placed at the top of the file
    public static final String CLASS_NAME = "Bootcamp";

    /// this is an example of an instance variable, because it belongs to the instance that is created
    // because it's private, only the class has access to it
    private String studentName;

    // command + n is the shortcut for code snippets generator

    // Constructor
    public Student(String studentName) {
        this.studentName = studentName;
    }

    public void printDetails() {
        System.out.println("Student's name is " + studentName + " Class is: " + CLASS_NAME);
    }

    public static void main(String[] args) {
        Student student = new Student("Amy");
        student.printDetails();
    }
}
