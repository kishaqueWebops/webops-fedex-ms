package com.webops.fedex.models;

import lombok.Data;

@Data
public class  BillingDetails {
    private String billingCode;
    private String billingType;
    private String aliasId;
    private String accountNickname;
    private String accountNumber;
    private String accountNumberCountryCode;
}
