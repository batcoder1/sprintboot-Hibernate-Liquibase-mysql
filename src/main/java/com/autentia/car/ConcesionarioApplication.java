package com.autentia.car;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

 
@SpringBootApplication
@ComponentScan("com.autentia.car")
public class ConcesionarioApplication {

	private static SpringApplication app = new SpringApplication(ConcesionarioApplication.class);

	public static void main(String[] args) {
		app.run(args);
	}

	static void setApp(SpringApplication app2) {
		ConcesionarioApplication.app = app2;
	}

}