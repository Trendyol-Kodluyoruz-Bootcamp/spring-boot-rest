package com.trendyol.bootcamp.controllers;

import com.trendyol.bootcamp.contract.response.CartResponse;
import com.trendyol.bootcamp.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/carts")
public class CartsController {

    @Autowired
    private CartService cartService;

    @GetMapping("/")
    public ResponseEntity<List<CartResponse>> getAllCarts() {
        List<CartResponse> carts = new ArrayList<>();
        CartResponse response = cartService.getMockData();

        carts.add(response);

        return ResponseEntity.ok(carts);
    }

    @GetMapping("/{id}")
    public ResponseEntity getAllCarts(@PathVariable String id) {
        if (id.equals("123-123")) {
            return ResponseEntity.badRequest().body("Id format is invalid");
        }

        CartResponse response = cartService.getMockData();

        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}/actions")
    public ResponseEntity<List<String>> getActions(@PathVariable String id) {
        List<String> actions = new ArrayList<>();

        actions.add("reserve");
        actions.add("merge");
        actions.add("preview");

        return ResponseEntity.ok(actions);
    }

    @GetMapping("/{id}/actions/preview")
    public ResponseEntity getCartPreview(@PathVariable String id) {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/{id}/actions/reserve")
    public ResponseEntity mergeCart(@PathVariable String id) {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/{id}/actions/merge")
    public ResponseEntity reserveCart(@PathVariable String id) {
        return ResponseEntity.ok().build();
    }
}
