package com.webops.fedex.models;

import lombok.Data;

@Data
public class  PrintedLabelOrigin {
    private Address address;
    private Contact contact;
}
