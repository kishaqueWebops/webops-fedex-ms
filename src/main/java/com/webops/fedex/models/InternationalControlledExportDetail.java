package com.webops.fedex.models;

import lombok.Data;

@Data
public class  InternationalControlledExportDetail {
    private String licenseOrPermitExpirationDate;
    private String licenseOrPermitNumber;
    private String entryNumber;
    private String foreignTradeZoneCode;
    private String type;
}
