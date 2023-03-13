package com.fluffyengine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class FluffyEngineApplication {

	public static void main(String[] args) {
		SpringApplication.run(FluffyEngineApplication.class, args);
	}

}
