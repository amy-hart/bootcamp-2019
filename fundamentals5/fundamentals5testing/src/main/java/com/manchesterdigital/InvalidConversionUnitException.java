package com.manchesterdigital;

// Writing our own exception class which extends the default RuntimeException class
public class InvalidConversionUnitException extends RuntimeException {
    public InvalidConversionUnitException(String message) {
        super(message);
    }
}
