package com.shoppingcartsystem.profileservice;

import java.util.Collections;


import org.springframework.boot.SpringApplication;



import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.context.annotation.Bean;
//import org.springframework.web.client.RestTemplate;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableSwagger2
@EnableEurekaClient
public class ProfileServiceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ProfileServiceApplication.class, args);
	}
    
	
    public Docket swaggerApiDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.any())
                .apis(RequestHandlerSelectors.basePackage("com.shoppingcartsystem.profileservice"))
                .build()
                .apiInfo(apiDetails());
    }
	private ApiInfo apiDetails() {
        return new ApiInfo("Profile Service API",
                "Profile details of users",
                "1.0",
                "",
                new springfox.documentation.service.Contact("Priya","www.profile.com",""),
                "API License","",
                Collections.emptyList());
			
	
}
}
