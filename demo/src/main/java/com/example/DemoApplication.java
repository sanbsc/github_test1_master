package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example1.Dependency1;

@SpringBootApplication
public class DemoApplication {
	// comments added!!!!
	// First branch created =====asfasd=!!!asasdfasd
	/*First branch created!!!*/
	/*3*/
	public static void main(String[] args) {
		SpringApplication.run(new Object[] { DemoApplication.class, Dependency1.class }, args);
	}
}
