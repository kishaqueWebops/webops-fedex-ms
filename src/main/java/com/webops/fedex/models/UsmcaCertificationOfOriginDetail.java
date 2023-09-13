package com.webops.fedex.models;

import lombok.Data;

import java.util.ArrayList;

@Data
public class  UsmcaCertificationOfOriginDetail {
    private ArrayList<CustomerImageUsage> customerImageUsages;
    private DocumentFormat documentFormat;
    private String certifierSpecification;
    private String importerSpecification;
    private String producerSpecification;
    private Producer producer;
    private BlanketPeriod blanketPeriod;
    private String certifierJobTitle;
}
