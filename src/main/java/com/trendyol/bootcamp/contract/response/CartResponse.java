package com.trendyol.bootcamp.contract.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class CartResponse {
    private List<ItemModel> items;
    private Object prices;
    private Object discounts;
    private Object shipping;
    private Object payment;
}
