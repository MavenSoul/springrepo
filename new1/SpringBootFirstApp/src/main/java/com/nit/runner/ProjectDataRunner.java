package com.nit.runner;

import java.util.List;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Component
@ConfigurationProperties(prefix = "my.app")
@RequiredArgsConstructor
@Data
public class ProjectDataRunner implements CommandLineRunner {
	
	private Integer prodId;
	private String prodCode;
	
	
	private Map<String,Double> versions;
		//private Set<String> modules;
		//private String[] modules;
		
	
	
	@Override
	public void run(String... args) throws Exception {
	System.out.println(this);
		
	}



	
	
	
	

}
