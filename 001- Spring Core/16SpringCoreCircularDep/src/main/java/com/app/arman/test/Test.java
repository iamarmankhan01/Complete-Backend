package com.app.arman.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.arman.ProjectService;
import com.app.arman.config.AppConfig;



public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		ProjectService ps = ac.getBean("projectService",ProjectService.class);
		System.out.println(ps);
	}
}