package com.example.unittesting;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest
class UnittestingApplicationTests {

	@Test
	void contextLoads() {
 		assertEquals(2, 1+1);
		System.out.println("seccess");
	}


	@Test
	@Disabled
	void compare(){
		int a=1;
		boolean b=(1==a);
	
		assertThat(b).isTrue();
	}


	
}
