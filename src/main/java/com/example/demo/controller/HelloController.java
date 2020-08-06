package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: XueHao
 * @Date: 2020/07/24
 * @Copyright: Copyright (c) wayyue.com Corporation. All Rights Reserved.
 */
@RestController
public class HelloController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello(){
        System.out.println("nihao!");
        return "Hello SpringBoot 2.x!";
    }
}
