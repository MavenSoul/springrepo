package com.nit.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nit.runner.MessageRunner;

@Configuration
public class Appconfig {

	@Bean
	public CommandLineRunner mobj()
	{
		return new MessageRunner();
		
	}
	
	@Bean
	public CommandLineRunner cob1() {
		return new CommandLineRunner() {
		public void run (String... args) throws Exception{
		System.out.println("5.Returning anonymus Class line -Runner");
		} };
		}
	
	@Bean
	public CommandLineRunner cob2() {
	return (args) -> {
	System.out.println("6.Returning Lambda Expression Class -Runner");
	};
	}
	
}
