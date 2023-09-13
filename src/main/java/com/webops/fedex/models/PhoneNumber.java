package com.webops.fedex.models;

import lombok.Data;

@Data
public class  PhoneNumber {
    private String areaCode;
    private String localNumber;
    private String extension;
    private String personalIdentificationNumber;
}
