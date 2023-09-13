package com.webops.fedex.models;

import lombok.Data;

@Data
public class  ReturnShipmentDetail {
    private ReturnEmailDetail returnEmailDetail;
    private Rma rma;
    private ReturnAssociationDetail returnAssociationDetail;
    private String returnType;
}
