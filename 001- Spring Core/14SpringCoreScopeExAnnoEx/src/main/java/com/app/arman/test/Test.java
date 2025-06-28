package com.app.arman.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.arman.bean.Token;
import com.app.arman.config.AppConfig;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		Token t1 = ac.getBean("tok", Token.class);
		System.out.println(t1);

		Token t2 = ac.getBean("tok", Token.class);
		System.out.println(t2);

		Token t3 = ac.getBean("tok", Token.class);
		System.out.println(t3);
	}

}
