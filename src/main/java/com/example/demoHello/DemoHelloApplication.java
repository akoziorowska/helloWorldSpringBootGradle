package com.example.demoHello;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoHelloApplication implements CommandLineRunner {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(DemoHelloApplication.class, args);
	}

	@Override
	public void run (final String... strings)throws Exception{
		System.out.println("Hello world");
	}
}
