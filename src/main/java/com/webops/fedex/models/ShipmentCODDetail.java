package com.webops.fedex.models;

import lombok.Data;

@Data
public class  ShipmentCODDetail {
    private AddTransportationChargesDetail addTransportationChargesDetail;
    private CodRecipient codRecipient;
    private String remitToName;
    private String codCollectionType;
    private FinancialInstitutionContactAndAddress financialInstitutionContactAndAddress;
    private CodCollectionAmount codCollectionAmount;
    private String returnReferenceIndicatorType;
    private ShipmentCodAmount shipmentCodAmount;
}
