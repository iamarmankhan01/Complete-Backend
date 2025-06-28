package com.app.arman.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.arman.bean.EmployeeService;
import com.app.arman.config.AppConfig;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		EmployeeService emp = ac.getBean("esobj", EmployeeService.class);
		System.out.println(emp);

	}

}
