package com.doughdev.healthapi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class HealthApiApplicationTests {

	@Test
	void contextLoads() {
		String author = "James";

		Assertions.assertEquals(author, "James");
	}

}
