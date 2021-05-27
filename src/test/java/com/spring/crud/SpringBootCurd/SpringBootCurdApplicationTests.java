package com.spring.crud.SpringBootCurd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
class SpringBootCurdApplicationTests {

	public static org.slf4j.Logger logger= LoggerFactory.getLogger(SpringBootCurdApplicationTests.class);
	
	@Test
	public void contextLoads() {
		logger.info("test case executing...");
		assertEquals(true, true);
	}

}
