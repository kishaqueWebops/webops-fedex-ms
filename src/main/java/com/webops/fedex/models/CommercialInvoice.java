package com.webops.fedex.models;

import lombok.Data;

import java.util.ArrayList;

@Data
public class  CommercialInvoice {
    private String originatorName;
    private ArrayList<String> comments;
    private ArrayList<CustomerReference> customerReferences;
    private TaxesOrMiscellaneousCharge taxesOrMiscellaneousCharge;
    private String taxesOrMiscellaneousChargeType;
    private FreightCharge freightCharge;
    private PackingCosts packingCosts;
    private HandlingCosts handlingCosts;
    private String declarationStatement;
    private String termsOfSale;
    private String specialInstructions;
    private String shipmentPurpose;
    private EmailNotificationDetail emailNotificationDetail;
}
