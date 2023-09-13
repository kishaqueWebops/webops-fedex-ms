package com.webops.fedex.models;

import lombok.Data;

@Data
public class  Root {
    private String mergeLabelDocOption;
    private RequestedShipment requestedShipment;
    private String labelResponseOptions;
    private AccountNumber accountNumber;
    private String shipAction;
    private String processingOptionType;
    private boolean oneLabelAtATime;
}
