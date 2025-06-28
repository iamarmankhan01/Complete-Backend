package com.app.arman.test;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.arman.bean.ExcelExport;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		ExcelExport ee = ac.getBean("exObj",ExcelExport.class);
		System.out.println("FROM MAIN");
		System.out.println(ee);
		//ac.registerShutdownHook(); //old-style
		ac.close();
	}
}
