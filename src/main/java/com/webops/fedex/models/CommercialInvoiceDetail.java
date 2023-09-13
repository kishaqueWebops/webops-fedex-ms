package com.webops.fedex.models;

import lombok.Data;

import java.util.ArrayList;

@Data
public class  CommercialInvoiceDetail {
    private ArrayList<CustomerImageUsage> customerImageUsages;
    private DocumentFormat documentFormat;
}
