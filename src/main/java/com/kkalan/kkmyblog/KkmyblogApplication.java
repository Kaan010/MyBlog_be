package com.kkalan.kkmyblog;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KkmyblogApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(KkmyblogApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("Hello World");
		System.out.println("new branch");
		System.out.println("second commit");
	}
}
