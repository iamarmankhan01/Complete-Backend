package com.app.arman;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class test {
	public static void main(String[] args) {
		//Creating Spring Container
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		//read object
		Object ob = ac.getBean("mobj");
		//print Data
		System.out.println(ob);	

	}
}
