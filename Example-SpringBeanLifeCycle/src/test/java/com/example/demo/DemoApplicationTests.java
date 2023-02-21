package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    UserBean userBean;

    @Test
    void springBeanLifeTest(){
        System.out.println("userBean 使用的:" + userBean);
    }

}
