package com.webops.fedex.models;

import lombok.Data;

@Data
public class  ShippingChargesPayment {
    private String paymentType;
    private Payor payor;
}
