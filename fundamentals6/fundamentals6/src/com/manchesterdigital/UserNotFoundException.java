package com.manchesterdigital;

// Handling 'user not found' error
// Creating our own class for handling the error
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
