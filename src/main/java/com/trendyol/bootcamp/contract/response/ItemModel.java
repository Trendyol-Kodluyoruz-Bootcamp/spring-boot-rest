package com.trendyol.bootcamp.contract.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class ItemModel {
    private String id;
    private String name;
    private List<String> images;
    private String createdOn;
    private Integer quantity;
    private Double sellingPrice;
    private Double discountedPrice;
}
