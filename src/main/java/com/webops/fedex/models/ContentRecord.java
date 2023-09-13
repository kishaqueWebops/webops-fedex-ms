package com.webops.fedex.models;

import lombok.Data;

@Data
public class  ContentRecord {
    private String itemNumber;
    private int receivedQuantity;
    private String description;
    private String partNumber;
}
