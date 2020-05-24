package com.bgamq.core.config;


import io.swagger.annotations.Api;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2
@Configuration
public class CoreSwaggerConfig {

    /**
     * swagger访问地址
     * http://127.0.0.1:9000/core/swagger-ui.html
     * @return
     */

    @Bean("核心模块")
    public Docket userApis() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("核心模块")
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                .paths(PathSelectors.regex("/engine.*"))
                .build()
                .apiInfo(apiInfo())
                .enable(true);
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("BS博客-核心模块接口文档")
                .description("提供核心模块的文档")
                .termsOfServiceUrl("http://www.bgamq.com/")
                .version("1.0")
                .build();
    }
}
