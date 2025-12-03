package com.example.restaurant;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value=config.Configs.class)
public class RestaurantTrackApplication {

	@Value("${app.name}") //application.properties okuma
	private static String appName;

	public static void main(String[] args) {
		SpringApplication.run(RestaurantTrackApplication.class, args);
		System.out.println(appName);
	}

}
