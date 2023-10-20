package com.shop1.repository;

import com.shop1.entity.ShopOne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopRepo extends JpaRepository<ShopOne, Integer> {

}
