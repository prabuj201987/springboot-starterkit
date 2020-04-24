package com.starterkit.springboot.brs.config;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.NamingConventions;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Arrays;

/**
 * Created by Arpit Khandelwal.
 */
@Configuration
public class BrsConfiguration {

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration()
                .setFieldMatchingEnabled(true)
                .setFieldAccessLevel(org.modelmapper.config.Configuration.AccessLevel.PRIVATE)
                .setSourceNamingConvention(NamingConventions.JAVABEANS_MUTATOR);
        return modelMapper;
        //https://github.com/modelmapper/modelmapper/issues/212
    }

//    /**
//     * Group BRS contains operations related to reservations and agency mangement
//     */
//    @Bean
//    public Docket swaggerBRSApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .groupName("BRS")
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.starterkit.springboot.brs.controller.v1.api"))
//                .paths(PathSelectors.any())
//                .build()
//                .apiInfo(apiInfo())
//                .securitySchemes(Arrays.asList(apiKey()));
//    }
//
//    /**
//     * Group User contains operations related to user mangement such as login/logout
//     */
//    @Bean
//    public Docket swaggerUserApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .groupName("User")
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.starterkit.springboot.brs.config"))
//                .paths(PathSelectors.any())
//                .build()
//                .apiInfo(apiInfo())
//                .securitySchemes(Arrays.asList(apiKey()));
//    }

    @Bean
    public GroupedOpenApi brsApi() {
        return GroupedOpenApi.builder()
                .setGroup("com.starterkit.springboot.brs.controller.v1.api")
                .pathsToMatch("/public/**")
                .build();
    }

    @Bean
    public GroupedOpenApi userApi() {
        return GroupedOpenApi.builder()
                .setGroup("com.starterkit.springboot.brs.config")
                .pathsToMatch("/admin/**")
                .build();
    }

//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder().title("Bus Reservation System - REST APIs")
//                .description("Spring Boot starter kit application.").termsOfServiceUrl("")
//                .contact(new Contact("Arpit Khandelwal", "https://medium.com/the-resonant-web", "khandelwal.arpit@outlook.com"))
//                .license("Apache License Version 2.0")
//                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
//                .version("0.0.1")
//                .build();
//    }
//
//    private ApiKey apiKey() {
//        return new ApiKey("apiKey", "Authorization", "header");
//    }

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(new Info().title("BRS API").description(
                        "This is a sample Spring Boot RESTful service using springdoc-openapi and OpenAPI 3."));
    }

}
