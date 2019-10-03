package com.manchesterdigital;

public class OrderProcessor {
    private OrderStatus orderStatus;

    public OrderProcessor(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void obtainCurrentOrderStatus() {
        // Enums can be compared like numbers with ==
        if(orderStatus == OrderStatus.DISPATCHED){
            System.out.println("You should receive your item soon...");
        }else {
            System.out.println("You'll have to wait a bit longer... Your order is at stage: "
            + orderStatus.toString());
        }
    }

    public void printOrderMessage() {
        System.out.println(orderStatus.getMessage());
    }
}
