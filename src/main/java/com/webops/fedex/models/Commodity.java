package com.webops.fedex.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;

@Data
public class  Commodity {
    private UnitPrice unitPrice;
    private ArrayList<AdditionalMeasure> additionalMeasures;
    private int numberOfPieces;
    private int quantity;
    private String quantityUnits;
    private CustomsValue customsValue;
    private String countryOfManufacture;
    private String cIMarksAndNumbers;
    private String harmonizedCode;
    private String description;
    private String name;
    private Weight weight;
    private String exportLicenseNumber;
    private Date exportLicenseExpirationDate;
    private String partNumber;
    private String purpose;
    private UsmcaDetail usmcaDetail;
}
