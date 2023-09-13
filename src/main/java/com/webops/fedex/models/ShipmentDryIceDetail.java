package com.webops.fedex.models;

import lombok.Data;

@Data
public class  ShipmentDryIceDetail {
    private TotalWeight totalWeight;
    private int packageCount;
}
