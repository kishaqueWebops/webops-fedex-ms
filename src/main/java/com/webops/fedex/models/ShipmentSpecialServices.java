package com.webops.fedex.models;

import lombok.Data;

import java.util.ArrayList;

@Data
public class  ShipmentSpecialServices {
    private ArrayList<String> specialServiceTypes;
    private EtdDetail etdDetail;
    private ReturnShipmentDetail returnShipmentDetail;
    private DeliveryOnInvoiceAcceptanceDetail deliveryOnInvoiceAcceptanceDetail;
    private InternationalTrafficInArmsRegulationsDetail internationalTrafficInArmsRegulationsDetail;
    private PendingShipmentDetail pendingShipmentDetail;
    private HoldAtLocationDetail holdAtLocationDetail;
    private ShipmentCODDetail shipmentCODDetail;
    private ShipmentDryIceDetail shipmentDryIceDetail;
    private InternationalControlledExportDetail internationalControlledExportDetail;
    private HomeDeliveryPremiumDetail homeDeliveryPremiumDetail;
}
