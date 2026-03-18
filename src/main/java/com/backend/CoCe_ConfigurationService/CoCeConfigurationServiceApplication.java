package com.backend.CoCe_ConfigurationService;

import org.jspecify.annotations.NonNull;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class CoCeConfigurationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoCeConfigurationServiceApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(@NonNull CorsRegistry registry) {
				registry.addMapping("/api/configuration").allowedOrigins("http://localhost:5173");
				registry.addMapping("/api/healthy").allowedOrigins("http://localhost:5173");
			}
		};
	}

}
