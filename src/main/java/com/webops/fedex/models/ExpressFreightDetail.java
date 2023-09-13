package com.webops.fedex.models;

import lombok.Data;

@Data
public class  ExpressFreightDetail {
    private String bookingConfirmationNumber;
    private int shippersLoadAndCount;
    private boolean packingListEnclosed;
}
