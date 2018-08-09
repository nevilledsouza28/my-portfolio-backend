package com.myportfolio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MyPortfolio implements ApplicationRunner, CommandLineRunner {
	private static final Logger logger = LoggerFactory.getLogger(MyPortfolio.class);
	@Value("${spring.application.name}")
	private String appName;
	
	@Autowired
	RestTemplate restTemplate;

	public static void main(String[] args) {
		SpringApplication.run(MyPortfolio.class, args);
	}

	@Override
	public void run(ApplicationArguments arg0) throws Exception {
		logger.info("Application Runner has executed");
	}

	@Override
	public void run(String... arg0) throws Exception {
		logger.info("Command Line Runner has executed");
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}