package com.app.arman.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.arman.bean.Product;

@Component
public class TestObjsRunner implements CommandLineRunner {

	@Autowired
	private Product pob;

	public void run(String... args) throws Exception {
		System.out.println(pob);
	}
}
