package com.trendyol.bootcamp.services;

import com.trendyol.bootcamp.contract.response.CartResponse;
import com.trendyol.bootcamp.contract.response.ItemModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Getter
public class CartService {
    public CartResponse getMockData() {
        List<ItemModel> items = new ArrayList<>();

        items.add(ItemModel.builder()
                .name("Playstation 5")
                .createdOn("")
                .id("123-123-123")
                .discountedPrice(1000D)
                .sellingPrice(1000D)
                .images(new ArrayList<>())
                .quantity(2)
                .build());

        return CartResponse.builder()
                .items(items)
                .build();
    }
}
