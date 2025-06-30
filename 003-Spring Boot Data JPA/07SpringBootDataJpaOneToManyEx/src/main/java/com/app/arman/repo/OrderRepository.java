package com.app.arman.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.arman.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
