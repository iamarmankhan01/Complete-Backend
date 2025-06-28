package com.app.arman.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.arman.bean.MyDbCon;

@Component
public class dbRunner implements CommandLineRunner {
	@Autowired
	private MyDbCon con;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(con);

	}

}
