package com.javatechie.jenkin.api;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringJenkinsApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);

	@Test
	public void contextLoads() {
		logger.info("Test case executing...");
		assertEquals(true, true);
	}

}
