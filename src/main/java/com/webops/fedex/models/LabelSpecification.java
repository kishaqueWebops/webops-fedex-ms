package com.webops.fedex.models;

import lombok.Data;

@Data
public class  LabelSpecification {
    private String labelFormatType;
    private String labelOrder;
    private CustomerSpecifiedDetail customerSpecifiedDetail;
    private PrintedLabelOrigin printedLabelOrigin;
    private String labelStockType;
    private String labelRotation;
    private String imageType;
    private String labelPrintingOrientation;
    private boolean returnedDispositionDetail;
}
