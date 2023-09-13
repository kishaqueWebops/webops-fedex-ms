package com.webops.fedex.models;

import lombok.Data;

import java.util.ArrayList;

@Data
public class  UsmcaCommercialInvoiceCertificationOfOriginDetail {
    private ArrayList<CustomerImageUsage> customerImageUsages;
    private DocumentFormat documentFormat;
    private String certifierSpecification;
    private String importerSpecification;
    private String producerSpecification;
    private Producer producer;
    private String certifierJobTitle;
}
