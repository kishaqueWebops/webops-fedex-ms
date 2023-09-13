package com.webops.fedex.models;

import lombok.Data;

import java.util.ArrayList;

@Data
public class  Op900Detail {
    private ArrayList<CustomerImageUsage> customerImageUsages;
    private String signatureName;
    private DocumentFormat documentFormat;
}
