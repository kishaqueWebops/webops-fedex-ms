package com.webops.fedex.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FedExClient {
    private String grantType;
    private String clientId;
    private String clientSecret;
    private String url;

    @Override
    public String toString() {
        return "grant_type=" + grantType +
                "&" +
                "client_id=" + clientId +
                "&" +
                "client_secret=" + clientSecret;
    }
}
