package com.example.apidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ApiDemoApplication  {

	public static void main(String[] args) {
		SpringApplication.run(ApiDemoApplication.class, args);
	}
//	 @Override
//	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//	        registry.addResourceHandler("/**")
//	                .addResourceLocations("classpath:/static/")
//	                .resourceChain(true);
//	    }
}
