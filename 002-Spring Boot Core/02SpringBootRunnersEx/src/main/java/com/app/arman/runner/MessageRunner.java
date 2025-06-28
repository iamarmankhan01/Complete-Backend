package com.app.arman.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(-23)
public class MessageRunner implements CommandLineRunner {
	public void run(String...args) {
		System.out.println("FROM MESSAGE RUNNER");
	}
	

}
