package com.doughdev.healthapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;

@SpringBootApplication
public class HealthApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthApiApplication.class, args);

		String author = modStr("James Dough");

		System.out.println(author);
	}

	private static String modStr(String str) {
		return str.toUpperCase(Locale.ROOT);
	}

}
