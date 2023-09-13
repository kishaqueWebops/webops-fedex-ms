package com.webops.fedex.models;

import lombok.Data;

@Data
public class  DocTabContent {
    private String docTabContentType;
    private Zone001 zone001;
    private Barcoded barcoded;
}
