package com.webops.fedex.models;

import lombok.Data;

@Data
public class  TaxesOrMiscellaneousCharge {
    private double amount;
    private String currency;
}
