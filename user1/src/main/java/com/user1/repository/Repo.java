package com.user1.repository;

import com.user1.entity.UserOne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<UserOne, Integer> {

}
