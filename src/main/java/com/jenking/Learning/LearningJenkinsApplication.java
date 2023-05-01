package com.jenking.Learning;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningJenkinsApplication {

	public static Logger logger = LoggerFactory.getLogger(LearningJenkinsApplication.class);

	@PostConstruct
	public void intt()
	{
		logger.info("Application started....");
	}

	public static void main(String[] args)
	{
		logger.info("Application executed in main...");
		SpringApplication.run(LearningJenkinsApplication.class, args);
	}

}
