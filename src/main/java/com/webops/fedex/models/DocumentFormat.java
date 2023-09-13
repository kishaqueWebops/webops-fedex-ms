package com.webops.fedex.models;

import lombok.Data;

import java.util.ArrayList;

@Data
public class  DocumentFormat {
    private boolean provideInstructions;
    private OptionsRequested optionsRequested;
    private String stockType;
    private ArrayList<Disposition> dispositions;
    private String locale;
    private String docType;
}
