package com.webops.fedex.models;

import lombok.Data;

import java.util.ArrayList;

@Data
public class  EmailNotificationRecipient {
    private String name;
    private String emailNotificationRecipientType;
    private String emailAddress;
    private String notificationFormatType;
    private String notificationType;
    private String locale;
    private ArrayList<String> notificationEventType;
}
