package com.trendyol.bootcamp.contract.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddItemRequest {

    private String contentId;
    private String campaignId;
    private String listingId;
    private Integer quantity;
}
