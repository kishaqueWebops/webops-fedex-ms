package com.webops.fedex.models;

import lombok.Data;

import java.util.ArrayList;

@Data
public class  ShippingDocumentSpecification {
    private GeneralAgencyAgreementDetail generalAgencyAgreementDetail;
    private ReturnInstructionsDetail returnInstructionsDetail;
    private Op900Detail op900Detail;
    private UsmcaCertificationOfOriginDetail usmcaCertificationOfOriginDetail;
    private UsmcaCommercialInvoiceCertificationOfOriginDetail usmcaCommercialInvoiceCertificationOfOriginDetail;
    private ArrayList<String> shippingDocumentTypes;
    private CertificateOfOrigin certificateOfOrigin;
    private CommercialInvoiceDetail commercialInvoiceDetail;
}
