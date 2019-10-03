package com.manchesterdigital;

public class Student extends Person {

    private String universityName;

    // Constructor
    public Student(java.lang.String firstName, java.lang.String lastName, Integer age, Address address) {
        super(firstName, lastName, age, address);
    }

    // Setter for universityName
    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public void haveLunch() {
        System.out.println("Has lunch at 12");
    }

    // Return string
    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();

        out.append("University Name: ");
        out.append(universityName);
        out.append("\n");
        out.append("Person: ");
        out.append(getAge());

        return out.toString();
    }
}
