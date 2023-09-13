package com.webops.fedex.models;

import lombok.Data;

import java.util.List;

@Data
public class  RequestedShipment {
    private String shipDatestamp;
    private TotalDeclaredValue totalDeclaredValue;
    private Shipper shipper;
    private SoldTo soldTo;
    private List<Recipient> recipients;
    private String recipientLocationNumber;
    private String pickupType;
    private String serviceType;
    private String packagingType;
    private double totalWeight;
    private Origin origin;
    private ShippingChargesPayment shippingChargesPayment;
    private ShipmentSpecialServices shipmentSpecialServices;
    private EmailNotificationDetail emailNotificationDetail;
    private ExpressFreightDetail expressFreightDetail;
    private VariableHandlingChargeDetail variableHandlingChargeDetail;
    private CustomsClearanceDetail customsClearanceDetail;
    private SmartPostInfoDetail smartPostInfoDetail;
    private boolean blockInsightVisibility;
    private LabelSpecification labelSpecification;
    private ShippingDocumentSpecification shippingDocumentSpecification;
    private List<String> rateRequestType;
    private String preferredCurrency;
    private int totalPackageCount;
    private MasterTrackingId masterTrackingId;
    private List<RequestedPackageLineItem> requestedPackageLineItems;
}
