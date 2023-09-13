package com.webops.fedex.models;

import lombok.Data;

import java.util.ArrayList;

@Data
public class  DestinationControlDetail {
    private String endUser;
    private String statementTypes;
    private ArrayList<String> destinationCountries;
}
