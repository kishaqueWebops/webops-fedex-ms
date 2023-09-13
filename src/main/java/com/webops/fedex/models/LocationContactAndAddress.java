package com.webops.fedex.models;

import lombok.Data;

@Data
public class  LocationContactAndAddress {
    private Address address;
    private Contact contact;
}
