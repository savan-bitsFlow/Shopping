package com.shop1.controller;

import com.shop1.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shop1")
public class Controller {

    @Autowired
    private Service service;


}
