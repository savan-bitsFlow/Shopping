package com.shop1.entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Getter
@Service
@AllArgsConstructor
@NoArgsConstructor
@jakarta.persistence.Entity
@Table(name = "shop_1")
public class ShopOne {

    @Id
    private int itemId;

    private String items;
    private int price;
    private String availability;

}
