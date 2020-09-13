package com.trendyol.bootcamp.controllers;

import com.trendyol.bootcamp.contract.request.AddItemRequest;
import com.trendyol.bootcamp.contract.request.UpdateQuantityRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/carts/{cartId}/items")
public class CartItemsController {

    @GetMapping
    public ResponseEntity<Integer> getCount(@PathVariable String cartId) {
        return ResponseEntity.ok(10);
    }

    @PostMapping
    public ResponseEntity addItem(@PathVariable String cartId, @RequestBody AddItemRequest request) {
        URI location = URI.create(String.format("/carts/%s/items/%s", cartId, "123-12132-121312"));
        return ResponseEntity.created(location).build();
    }

    @PatchMapping("/{itemId}")
    public ResponseEntity updateQuantity(@PathVariable String cartId, @PathVariable String itemId, @RequestParam UpdateQuantityRequest request) {
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{itemId}")
    public ResponseEntity deleteItem(@PathVariable String cartId, @PathVariable String itemId) {
        return ResponseEntity.noContent().build();
    }
}
