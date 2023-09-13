package com.webops.fedex.models;

import lombok.Data;

@Data
public class FedExShipmentRequest {
    private AccountNumber accountNumber;
    private String labelResponseOptions;
    private RequestedShipment requestedShipment;
}
