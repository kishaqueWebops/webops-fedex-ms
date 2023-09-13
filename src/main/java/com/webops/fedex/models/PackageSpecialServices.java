package com.webops.fedex.models;

import lombok.Data;

import java.util.ArrayList;

@Data
public class  PackageSpecialServices {
    private ArrayList<String> specialServiceTypes;
    private String signatureOptionType;
    private PriorityAlertDetail priorityAlertDetail;
    private SignatureOptionDetail signatureOptionDetail;
    private AlcoholDetail alcoholDetail;
    private DangerousGoodsDetail dangerousGoodsDetail;
    private PackageCODDetail packageCODDetail;
    private int pieceCountVerificationBoxCount;
    private ArrayList<BatteryDetail> batteryDetails;
    private DryIceWeight dryIceWeight;
}
