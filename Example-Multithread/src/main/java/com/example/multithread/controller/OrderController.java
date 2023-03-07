package com.example.multithread.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author DiiD
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @PostMapping("/{id}")
    public ResponseEntity<Object> InsertOrder(@PathVariable String id) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(Integer.valueOf(id), Integer.valueOf(id));
        return new ResponseEntity<>(hashMap, HttpStatus.OK);
    }
}
