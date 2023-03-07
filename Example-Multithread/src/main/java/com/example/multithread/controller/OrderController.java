package com.example.multithread.controller;

import com.example.multithread.domain.Order;
import com.example.multithread.service.IOrderService;
import com.example.multithread.service.impl.OrderServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * @author DiiD
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    IOrderService orderService;

    @PostMapping("/{id}")
    public ResponseEntity<Object> InsertOrder(@PathVariable String id) throws InterruptedException {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(Integer.valueOf(id), Integer.parseInt(id) + 1);
        Order order = new Order();
        order.setOrderId(Long.valueOf(id));
        orderService.addOrder(order);
        return new ResponseEntity<>(hashMap, HttpStatus.OK);
    }
}
