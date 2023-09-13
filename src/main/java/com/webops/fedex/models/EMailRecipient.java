package com.webops.fedex.models;

import lombok.Data;

@Data
public class  EMailRecipient {
    private String emailAddress;
    private String recipientType;
}
