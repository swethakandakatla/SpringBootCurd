package com.spring.crud.SpringBootCurd;
import javax.annotation.PostConstruct;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class SpringBootCurdApplication {
	
	public static org.slf4j.Logger logger= LoggerFactory.getLogger(SpringBootCurdApplication.class);
	
	@PostConstruct
	public void intt()
	{
		logger.info("Application started...");
	}

	public static void main(String[] args) {
		logger.info("Application executed...");
		SpringApplication.run(SpringBootCurdApplication.class, args);
	}

}
