package com.webops.fedex.models;

import lombok.Data;

import java.util.ArrayList;

@Data
public class  EmailLabelDetail {
    private ArrayList<Recipient> recipients;
    private String message;
}
