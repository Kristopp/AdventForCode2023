package com.aoc.aoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aoc.aoc.dayOne.DayOne;

@SpringBootApplication
public class AocApplication {

	public static void main(String[] args) {
		SpringApplication.run(AocApplication.class, args);
	}

	// Somewhere in your application
	DayOne dayOne = new DayOne();

}
