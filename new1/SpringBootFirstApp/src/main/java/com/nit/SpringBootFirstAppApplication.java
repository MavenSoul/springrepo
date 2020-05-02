package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nit.simpleclass.SimpleClass;

@SpringBootApplication
public class SpringBootFirstAppApplication {

	public static void main(String[] args) {
		ApplicationContext con =SpringApplication.run(SpringBootFirstAppApplication.class, args);
		System.out.println("1.Spring-boot-main-class");
		
		
	    SimpleClass sim = con.getBean(SimpleClass.class);
	    sim.code();
		
	}

}
