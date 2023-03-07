package com.example.multithread.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author DiiD
 */
public class Order {
    private Long orderId;
    private String orderName;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderName='" + orderName + '\'' +
                '}';
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
}
