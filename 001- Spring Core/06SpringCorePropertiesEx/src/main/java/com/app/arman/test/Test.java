package com.app.arman.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.arman.bean.DatabaseCon;
import com.app.arman.config.AppConfig;

public class Test {
	public static void main(String[] args) {

		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		DatabaseCon db = ac.getBean("dbObj", DatabaseCon.class);
		System.out.println(db);
	}
}
