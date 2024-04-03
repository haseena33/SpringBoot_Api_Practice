////package com.example.apidemo.cors;
////
////import org.springframework.web.servlet.config.annotation.CorsRegistry;
////import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
////
////public class CorsConfig implements WebMvcConfigurer {
////	 @Override
////	    public void addCorsMappings(CorsRegistry registry) {
////	        registry.addMapping("/**")
////	                .allowedOrigins("http://localhost:3000") // Allow requests from React app
////	                .allowedMethods("GET", "POST", "PUT", "DELETE")
////	                .allowedHeaders("*");
////	    }
////	}
//
//
//package com.example.apidemo.cors;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class CorsConfig {
//    @Bean
//    public WebMvcConfigurer corsConfigurer() {
//        return new WebMvcConfigurer() {
//            @Override
//            public void addCorsMappings(CorsRegistry registry) {
//                registry.addMapping("/api/**")
//                        .allowedOrigins("http://localhost:3000")
//                        .allowedMethods("GET", "POST", "PUT", "DELETE")
//                        .allowCredentials(true);
//            }
//        };
//    }
//}
