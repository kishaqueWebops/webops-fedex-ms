package com.webops.fedex.models;

import lombok.Data;

@Data
public class  VariableHandlingChargeDetail {
    private String rateType;
    private double percentValue;
    private String rateLevelType;
    private FixedValue fixedValue;
    private String rateElementBasis;
}
