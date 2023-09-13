package com.webops.fedex.models;

import lombok.Data;

import java.util.Date;

@Data
public class  Tin {
    private String number;
    private String tinType;
    private String usage;
    private Date effectiveDate;
    private Date expirationDate;
}
