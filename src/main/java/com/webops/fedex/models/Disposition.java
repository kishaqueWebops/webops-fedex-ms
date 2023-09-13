package com.webops.fedex.models;

import lombok.Data;

@Data
public class  Disposition {
    private EMailDetail eMailDetail;
    private String dispositionType;
}
