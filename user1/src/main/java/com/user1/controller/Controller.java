package com.user1.controller;

import com.user1.entity.UserOne;
import com.user1.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user1")
public class Controller {

    @Autowired
    private Service service;

    @PostMapping("")
    public UserOne placeOrder(@RequestBody UserOne userOne){
        return service.placeOrder(userOne);
    }
}
