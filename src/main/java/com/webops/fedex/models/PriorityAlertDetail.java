package com.webops.fedex.models;

import lombok.Data;

import java.util.ArrayList;

@Data
public class  PriorityAlertDetail {
    private ArrayList<String> enhancementTypes;
    private ArrayList<String> content;
}
