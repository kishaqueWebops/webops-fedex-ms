package com.webops.fedex.models;

import lombok.Data;

@Data
public class  Barcoded {
    private String symbology;
    private Specification specification;
}
