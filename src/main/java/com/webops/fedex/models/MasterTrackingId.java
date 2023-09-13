package com.webops.fedex.models;

import lombok.Data;

@Data
public class  MasterTrackingId {
    private String formId;
    private String trackingIdType;
    private String uspsApplicationId;
    private String trackingNumber;
}
