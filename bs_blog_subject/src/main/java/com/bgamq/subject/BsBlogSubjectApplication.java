package com.bgamq.subject;

import com.bgamq.subject.config.SubjectInterceptorConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class BsBlogSubjectApplication implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(subjectInterceptorConfig())
                .addPathPatterns("/**").excludePathPatterns("/login","/register");
    }

    @Bean
    public SubjectInterceptorConfig subjectInterceptorConfig() {
        return new SubjectInterceptorConfig();
    }


    public static void main(String[] args) {
        SpringApplication.run(BsBlogSubjectApplication.class, args);
    }

}
