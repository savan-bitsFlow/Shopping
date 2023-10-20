package com.shop1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "placed_orders")
public class PlacedOrders {
    @Id
    private int orderId;
    private String itemName;
    private int finalPrice;
    private String userName;
    private String userId;
}
