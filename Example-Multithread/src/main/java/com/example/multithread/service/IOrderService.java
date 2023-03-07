package com.example.multithread.service;

import com.example.multithread.domain.Order;

/**
 * @author DiiD
 */
public interface IOrderService {

    public void addOrder(Order order) throws InterruptedException;
}
