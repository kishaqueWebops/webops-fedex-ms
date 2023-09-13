package com.webops.fedex.models;

import lombok.Data;

import java.util.ArrayList;

@Data
public class  Recipient {
    private Address address;
    private Contact contact;
    private ArrayList<Tin> tins;
    private String deliveryInstructions;
    private String emailAddress;
    private OptionsRequested optionsRequested;
    private String role;
    private String locale;
}
