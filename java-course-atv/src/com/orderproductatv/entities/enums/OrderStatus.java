package com.orderproductatv.entities.enums;

public enum OrderStatus {

    PENDING_PAYMENT("Pending payment"),
    PROCESSING("Processing"), 
    SHIPPED("Shipped"),
    DELIVERED("Delivered");

    private String status;

    private OrderStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}