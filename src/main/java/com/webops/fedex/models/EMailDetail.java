package com.webops.fedex.models;

import lombok.Data;

import java.util.ArrayList;

@Data
public class  EMailDetail {
    private ArrayList<EMailRecipient> eMailRecipients;
    private String locale;
    private String grouping;
}
