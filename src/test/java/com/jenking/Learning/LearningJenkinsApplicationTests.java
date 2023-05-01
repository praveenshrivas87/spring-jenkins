package com.jenking.Learning;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LearningJenkinsApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(LearningJenkinsApplication.class);

	@Test
	void contextLoads() {
		logger.info("Test case executed...");
	}

}
