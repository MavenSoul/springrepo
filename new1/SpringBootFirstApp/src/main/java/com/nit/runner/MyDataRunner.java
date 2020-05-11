package com.nit.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component // create object
@ConfigurationProperties(prefix = "my.app")
public class MyDataRunner implements CommandLineRunner{

	private int id;
	private String code;
	private double version;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
	}
	
	
	//alt+shift+S  S  > Generate
	@Override
	public String toString() {
		return "--->MyDataRunner [id=" + id + ", code=" + code + ", version=" + version + "]";
	}
	
}

