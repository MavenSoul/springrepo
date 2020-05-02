package com.nit.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class SpringBootRunner implements CommandLineRunner,Ordered {

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("2.Welcome-Command-Line-Runner-->");

	}

	@Override
	public int getOrder() {
		
		return 2;
	}
	


}
