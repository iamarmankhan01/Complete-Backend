package com.app.arman.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.arman.config.AppConfig;
import com.app.arman.service.StudentService;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac  = new AnnotationConfigApplicationContext(AppConfig.class);
		StudentService stu = ac.getBean("ss",StudentService.class);
		
		System.out.println(stu);
		
	}

}
