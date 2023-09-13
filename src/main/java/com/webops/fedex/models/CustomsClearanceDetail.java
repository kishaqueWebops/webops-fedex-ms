package com.webops.fedex.models;

import lombok.Data;

import java.util.ArrayList;

@Data
public class  CustomsClearanceDetail {
    private String regulatoryControls;
    private ArrayList<Broker> brokers;
    private CommercialInvoice commercialInvoice;
    private String freightOnValue;
    private DutiesPayment dutiesPayment;
    private ArrayList<Commodity> commodities;
    private boolean isDocumentOnly;
    private RecipientCustomsId recipientCustomsId;
    private CustomsOption customsOption;
    private ImporterOfRecord importerOfRecord;
    private String generatedDocumentLocale;
    private ExportDetail exportDetail;
    private TotalCustomsValue totalCustomsValue;
    private boolean partiesToTransactionAreRelated;
    private DeclarationStatementDetail declarationStatementDetail;
    private InsuranceCharge insuranceCharge;
}
