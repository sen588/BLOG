package com.bgamq.web;

import com.bgamq.web.config.WebInterceptorConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class BsBlogWebApplication implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(webInterceptorConfig())
                .addPathPatterns("/**").excludePathPatterns("/login","/register");
    }

    @Bean
    public WebInterceptorConfig webInterceptorConfig() {
        return new WebInterceptorConfig();
    }

    public static void main(String[] args) {
        SpringApplication.run(BsBlogWebApplication.class, args);
    }

}
