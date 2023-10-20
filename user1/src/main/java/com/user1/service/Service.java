package com.user1.service;

import com.user1.entity.UserOne;
import com.user1.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private Repo repo;

    public UserOne placeOrder(UserOne userOne){
        return repo.save(userOne);
    }
}
