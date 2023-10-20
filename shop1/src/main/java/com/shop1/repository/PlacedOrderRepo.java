package com.shop1.repository;

import com.shop1.entity.PlacedOrders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlacedOrderRepo extends JpaRepository<PlacedOrders, Integer> {

}
