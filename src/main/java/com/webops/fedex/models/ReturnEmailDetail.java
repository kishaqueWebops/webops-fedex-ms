package com.webops.fedex.models;

import lombok.Data;

import java.util.ArrayList;

@Data
public class  ReturnEmailDetail {
    private String merchantPhoneNumber;
    private ArrayList<String> allowedSpecialService;
}
