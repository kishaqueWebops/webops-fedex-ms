package com.webops.fedex.models;

import lombok.Data;

@Data
public class  AttachedDocument {
    private String documentType;
    private String documentReference;
    private String description;
    private String documentId;
}
