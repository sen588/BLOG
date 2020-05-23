package com.bgamq.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BsBlogGatewayApplication{
    public static void main(String[] args) {
        SpringApplication.run(BsBlogGatewayApplication.class, args);
    }

}
