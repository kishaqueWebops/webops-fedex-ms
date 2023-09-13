package com.webops.fedex.models;

import lombok.Data;

import java.util.List;

@Data
public class Address {
    private List<String> streetLines;
    private String city;
    private String stateOrProvinceCode;
    private String postalCode;
    private String countryCode;
    private boolean residential;
}
