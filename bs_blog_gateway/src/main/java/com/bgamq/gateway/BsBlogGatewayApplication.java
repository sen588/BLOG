package com.bgamq.gateway;

import com.bgamq.gateway.config.GatewayInterceptorConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class BsBlogGatewayApplication implements WebMvcConfigurer {

    @Value("${sso.excludes}")
    public String excludes;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(gatewayInterceptorConfig())
                .addPathPatterns("/**").excludePathPatterns(excludes);
    }

    @Bean
    public GatewayInterceptorConfig gatewayInterceptorConfig() {
        return new GatewayInterceptorConfig();
    }

    public static void main(String[] args) {
        SpringApplication.run(BsBlogGatewayApplication.class, args);
    }

}
