package com.shop1.service;

import com.shop1.repository.PlacedOrderRepo;
import com.shop1.repository.ShopRepo;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private ShopRepo shopRepo;

    @Autowired
    private PlacedOrderRepo placedOrderRepo;

}
