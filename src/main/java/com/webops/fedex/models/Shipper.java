package com.webops.fedex.models;

import lombok.Data;

import java.util.ArrayList;

@Data
public class  Shipper {
    private Address address;
    private Contact contact;
    private ArrayList<Tin> tins;
}
