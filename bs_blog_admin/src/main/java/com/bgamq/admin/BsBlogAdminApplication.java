package com.bgamq.admin;

import com.bgamq.admin.config.AdminInterceptorConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class BsBlogAdminApplication implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(adminInterceptorConfig())
                .addPathPatterns("/**").excludePathPatterns("/login","/register");
    }

    @Bean
    public AdminInterceptorConfig adminInterceptorConfig() {
        return new AdminInterceptorConfig();
    }

    public static void main(String[] args) {
        SpringApplication.run(BsBlogAdminApplication.class, args);
    }

}
