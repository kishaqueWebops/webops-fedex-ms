package com.webops.fedex.models;

import lombok.Data;

@Data
public class  DutiesPayment {
    private Payor payor;
    private BillingDetails billingDetails;
    private String paymentType;
}
