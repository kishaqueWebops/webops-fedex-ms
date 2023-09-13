package com.webops.fedex.models;

import lombok.Data;

@Data
public class AddTransportationChargesDetail {
    private String rateType;
    private String rateLevelType;
    private String chargeLevelType;
    private String chargeType;
}
