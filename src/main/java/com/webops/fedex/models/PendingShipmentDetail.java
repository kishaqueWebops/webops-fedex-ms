package com.webops.fedex.models;

import lombok.Data;

import java.util.ArrayList;

@Data
public class  PendingShipmentDetail {
    private String pendingShipmentType;
    private ProcessingOptions processingOptions;
    private RecommendedDocumentSpecification recommendedDocumentSpecification;
    private EmailLabelDetail emailLabelDetail;
    private ArrayList<AttachedDocument> attachedDocuments;
    private String expirationTimeStamp;
}
