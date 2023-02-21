package com.example.multithread.controller;

import com.example.multithread.domain.User;
import com.example.multithread.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author DiiD
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService userService;

    @GetMapping("/login/{loginName}")
    public ResponseEntity<Object> selectUserByLoginName(@PathVariable("loginName") String loginName){
        return new ResponseEntity<>(userService.selectUserByLoginName(loginName), HttpStatus.OK);
    }

    @GetMapping("/select/{userId}")
    public ResponseEntity<Object> selectUserById(@PathVariable Long userId){
        return new ResponseEntity<>(userService.selectUserById(userId), HttpStatus.OK);
    }

    @PostMapping("/delete/{userId}")
    public ResponseEntity<Object> deleteUserById(@PathVariable Long userId){
        return new ResponseEntity<>(userService.deleteUserById(userId), HttpStatus.OK);
    }

    @PostMapping("/delete")
    public ResponseEntity<Object> deleteUserByIds(String ids) {
        return new ResponseEntity<>(userService.deleteUserByIds(ids), HttpStatus.OK);
    }

    @PostMapping("/edit")
    public ResponseEntity<Object> updateUser(@RequestBody User user) {
        int result = 0;
        synchronized (this) {
            result = userService.updateUser(user);
        }
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Object> insertUser(@RequestBody User user) {
        return new ResponseEntity<>(userService.insertUser(user), HttpStatus.OK);
    }

}
