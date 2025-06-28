package com.app.arman.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.arman.bean.MyDbConnection;
import com.app.arman.config.AppConfig;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		MyDbConnection db = ac.getBean("dbObj",MyDbConnection.class);
		System.out.println(db);
		
	}

}
