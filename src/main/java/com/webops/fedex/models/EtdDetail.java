package com.webops.fedex.models;

import lombok.Data;

import java.util.ArrayList;

@Data
public class  EtdDetail {
    private ArrayList<String> attributes;
    private ArrayList<AttachedDocument> attachedDocuments;
    private ArrayList<String> requestedDocumentTypes;
}
