package com.webops.fedex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableConfigurationProperties
public class WebopsFedexMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebopsFedexMsApplication.class, args);
	}

}
