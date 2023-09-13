package com.webops.fedex.models;

import lombok.Data;

@Data
public class  HomeDeliveryPremiumDetail {
    private PhoneNumber phoneNumber;
    private String deliveryDate;
    private String homedeliveryPremiumType;
}
