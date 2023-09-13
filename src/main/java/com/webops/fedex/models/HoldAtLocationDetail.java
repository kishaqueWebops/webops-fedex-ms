package com.webops.fedex.models;

import lombok.Data;

@Data
public class  HoldAtLocationDetail {
    private String locationId;
    private LocationContactAndAddress locationContactAndAddress;
    private String locationType;
}
