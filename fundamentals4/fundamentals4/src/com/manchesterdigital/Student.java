package com.manchesterdigital;

public class Student {

    // member variable, only belongs to the class
    private String name;

    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Created with command + N shortcut (can select multiple options)
    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method overloading

    public Student() {
    }

    Student frenchStudent = new Student();

    //

    Student mathsStudent = new Student("Duncan", 23);

    // method overriding, overriding the default toString method
    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", age=" + age;
    }

    public static void main(String[] args) {
        Student englishStudent = new Student("Amy");
    }






}
