package com.webops.fedex.models;

import lombok.Data;

import java.util.ArrayList;

@Data
public class  RequestedPackageLineItem {
    private String sequenceNumber;
    private String subPackagingType;
    private ArrayList<CustomerReference> customerReferences;
    private DeclaredValue declaredValue;
    private Weight weight;
    private Dimensions dimensions;
    private int groupPackageCount;
    private String itemDescriptionForClearance;
    private ArrayList<ContentRecord> contentRecord;
    private String itemDescription;
    private VariableHandlingChargeDetail variableHandlingChargeDetail;
    private PackageSpecialServices packageSpecialServices;
    private String trackingNumber;
}
