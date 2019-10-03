package com.manchesterdigital;

// More realistic example of using enums
public enum OrderStatus {
    // Creating enums using constructor
    PENDING("Order is pending"), DISPATCHED("Order has been dispatched"),
    DECLINED("Order has been declined"), AWAITING_PAYMENT("Order is awaiting payment"),
    PROCESSED("Order has been processed");

    // Variables
    private final String message;

    // Constructor
    OrderStatus(String message) {
        this.message = message;
    }

    // Getter for status message
    public String getMessage() {
        return message;
    }
}
