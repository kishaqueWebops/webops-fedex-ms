package com.webops.fedex.config;

import com.webops.fedex.models.FedExClient;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class FedExClientConfig {

    @Value("${fedex.oauth.grant.type}")
    private String grantType;
    @Value("${fedex.oauth.client.id}")
    private String clientId;
    @Value("${fedex.oauth.client.secret}")
    private String clientSecret;
    @Value("${fedex.oauth.url}")
    private String url;

    @Bean
    public FedExClient fedExClient() {
        return FedExClient.builder()
                .clientId(clientId)
                .clientSecret(clientSecret)
                .grantType(grantType)
                .url(url)
                .build();
    }
}
