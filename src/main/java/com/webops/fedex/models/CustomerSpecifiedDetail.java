package com.webops.fedex.models;

import lombok.Data;

import java.util.ArrayList;

@Data
public class  CustomerSpecifiedDetail {
    private ArrayList<String> maskedData;
    private ArrayList<RegulatoryLabel> regulatoryLabels;
    private ArrayList<AdditionalLabel> additionalLabels;
    private DocTabContent docTabContent;
}
