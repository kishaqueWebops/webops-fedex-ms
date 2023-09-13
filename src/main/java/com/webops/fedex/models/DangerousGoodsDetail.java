package com.webops.fedex.models;

import lombok.Data;

import java.util.ArrayList;

@Data
public class  DangerousGoodsDetail {
    private boolean cargoAircraftOnly;
    private String accessibility;
    private ArrayList<String> options;
}
