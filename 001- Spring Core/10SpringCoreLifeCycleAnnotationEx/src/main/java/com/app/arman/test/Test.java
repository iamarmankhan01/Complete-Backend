package com.app.arman.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.app.arman.bean.ExcelExport;
import com.app.arman.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		ExcelExport ee = ac.getBean("exObj",ExcelExport.class);
		System.out.println("FROM MAIN");
		System.out.println(ee);
		//ac.registerShutdownHook(); //old-style
		ac.close();
	}
}
