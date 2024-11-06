package com.booking.grocery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.grocery.exception.ResourceNotFoundException;
import com.booking.grocery.model.GroceryItem;
import com.booking.grocery.repository.GroceryItemRepository;



@Service
public class GroceryItemService {
    @Autowired
    private GroceryItemRepository groceryItemRepository;

    public List<GroceryItem> getAllItems() {
        return groceryItemRepository.findAll();
    }

    public GroceryItem addItem(GroceryItem item) {
        return groceryItemRepository.save(item);
    }

    public GroceryItem updateItem(Long id, GroceryItem item) {
        GroceryItem existingItem = groceryItemRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Item not found"));
        existingItem.setName(item.getName());
        existingItem.setPrice(item.getPrice());
        existingItem.setQuantity(item.getQuantity());
        return groceryItemRepository.save(existingItem);
    }

    public void deleteItem(Long id) {
        groceryItemRepository.deleteById(id);
    }
}
