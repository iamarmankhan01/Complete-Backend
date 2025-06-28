package com.hw.arman;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		// Object obj = ac.getBean("s");
		Student obj = ac.getBean("s", Student.class);

		System.out.println(obj);

		// System.out.println(ob.getData().getClass().getName());

		System.out.println(obj.getSid());
		System.out.println(obj.getSname());
		System.out.println(obj.getMarks().getClass().getName());
		System.out.println(obj.getSubject().getClass().getName());
		System.out.println(obj.getGrades().getClass().getName());

	}

}
