package com.webops.fedex.models;

import lombok.Data;

@Data
public class  CustomerReference {
    private String customerReferenceType;
    private String value;
}
