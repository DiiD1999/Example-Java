package com.example.multithread.service.impl;

import com.example.multithread.domain.Order;
import com.example.multithread.service.IOrderService;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author DiiD
 */
@Service
public class OrderServiceImpl implements IOrderService {

    @Override
    public void addOrder(Order order) throws InterruptedException {
        long id = order.getOrderId();
        id++;
        order.setOrderId(id);
        System.out.println(order);
    }
}
