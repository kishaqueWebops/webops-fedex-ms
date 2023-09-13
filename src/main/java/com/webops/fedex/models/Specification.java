package com.webops.fedex.models;

import lombok.Data;

@Data
public class  Specification {
    private int zoneNumber;
    private String header;
    private String dataField;
    private String literalValue;
    private String justification;
}
