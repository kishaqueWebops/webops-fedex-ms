package com.webops.fedex.models;

import lombok.Data;

@Data
public class  Dimensions {
    private int length;
    private int width;
    private int height;
    private String units;
}
