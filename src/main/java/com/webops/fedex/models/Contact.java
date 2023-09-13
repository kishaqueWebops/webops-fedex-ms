package com.webops.fedex.models;

import lombok.Data;

@Data
public class  Contact {
    private String personName;
    private String emailAddress;
    private String phoneExtension;
    private String phoneNumber;
    private String companyName;
    private int faxNumber;
}
