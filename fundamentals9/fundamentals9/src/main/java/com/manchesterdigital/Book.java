package com.manchesterdigital;

// Single responsibility principle
public class Book {
    private String name;
    private String author;
    private  String isbn;
    // Outsource printing to a new class
    // Can do book.Printer.print...
    private Printer printer;

    // constructor, getters, setters go here...

    public boolean isInISBN(String sequence) {
        return isbn.contains(sequence);
    }

}
