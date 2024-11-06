package com.booking.grocery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booking.grocery.model.GroceryItem;
import com.booking.grocery.service.GroceryItemService;


@RestController
@RequestMapping("/api/admin")
public class AdminController {
    @Autowired
    private GroceryItemService groceryItemService;

    @GetMapping("/items")
    public List<GroceryItem> getAllItems() {
        return groceryItemService.getAllItems();
    }

    @PostMapping("/items")
    public ResponseEntity<GroceryItem> addItem(@RequestBody GroceryItem item) {
        return ResponseEntity.ok(groceryItemService.addItem(item));
    }

    @PutMapping("/items/{id}")
    public ResponseEntity<GroceryItem> updateItem(@PathVariable Long id, @RequestBody GroceryItem item) {
        return ResponseEntity.ok(groceryItemService.updateItem(id, item));
    }

    @DeleteMapping("/items/{id}")
    public ResponseEntity<Void> deleteItem(@PathVariable Long id) {
        groceryItemService.deleteItem(id);
        return ResponseEntity.noContent().build();
    }
}