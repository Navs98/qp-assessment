package com.booking.grocery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.booking.grocery.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
