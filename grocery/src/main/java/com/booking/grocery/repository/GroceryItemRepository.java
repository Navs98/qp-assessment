package com.booking.grocery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.booking.grocery.model.GroceryItem;

public interface GroceryItemRepository extends JpaRepository<GroceryItem, Long> {
}
