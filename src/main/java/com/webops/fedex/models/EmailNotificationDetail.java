package com.webops.fedex.models;

import lombok.Data;

import java.util.ArrayList;

@Data
public class  EmailNotificationDetail {
    private String aggregationType;
    private ArrayList<EmailNotificationRecipient> emailNotificationRecipients;
    private String personalMessage;
    private String emailAddress;
    private String type;
    private String recipientType;
}
