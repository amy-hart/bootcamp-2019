package com.manchesterdigital;

public class Teacher extends Person {
    public Teacher(String firstName, String lastName, Integer age, Address address) {
        super(firstName, lastName, age, address);
    }

    @Override
    public void haveLunch() {
        System.out.println("Has lunch at 1pm");

    }


}
