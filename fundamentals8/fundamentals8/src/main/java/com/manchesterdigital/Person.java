package com.manchesterdigital;

public abstract class Person {
    // finals cannot be changed once an object has been created, not even with a setter
    // In this example you could use a final ID, and have changable first name and last name
    private final String firstName;
    private final String lastName;
    private final Integer age;
    private final Address address;

    public Person(String firstName, String lastName, Integer age, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    // Abstract method
    public abstract void haveLunch();

    // Because this method is final, you can't create another method with this name for overloading
    // You also can't alter the method once it's been created
    public final String sayHello() {
        return "Hello!";
    }

    public void printAddress() {
        System.out.println(address.toString());
    }

    // Getters - Because these variables are private you need getters to access them
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public Integer getAge() {
        return age;
    }
    public Address getAddress() {
        return address;
    }
}
