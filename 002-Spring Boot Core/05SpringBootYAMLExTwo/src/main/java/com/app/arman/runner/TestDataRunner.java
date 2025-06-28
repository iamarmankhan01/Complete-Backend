package com.app.arman.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.arman.bean.ProductInfo;



@Component
public class TestDataRunner implements CommandLineRunner {

	@Autowired
	private ProductInfo pob;
	
	public void run(String... args) throws Exception {
		System.out.println(pob);
	}
}
