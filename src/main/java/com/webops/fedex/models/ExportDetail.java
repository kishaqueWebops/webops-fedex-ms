package com.webops.fedex.models;

import lombok.Data;

@Data
public class  ExportDetail {
    private DestinationControlDetail destinationControlDetail;
    private String b13AFilingOption;
    private String exportComplianceStatement;
    private String permitNumber;
}
