package com.webops.fedex.models;

import lombok.Data;

import java.util.ArrayList;

@Data
public class  Broker2 {
    private Address address;
    private Contact contact;
    private AccountNumber accountNumber;
    private ArrayList<Tin> tins;
    private String deliveryInstructions;
}
