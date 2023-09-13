package com.webops.fedex.models;

import lombok.Data;

import java.util.ArrayList;

@Data
public class  ResponsibleParty {
    private Address address;
    private Contact contact;
    private AccountNumber accountNumber;
    private ArrayList<Tin> tins;
}
