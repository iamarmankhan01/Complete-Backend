package com.app.arman;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
	
		//===========First approach ===ye use nahi karna hai ========
	/*	AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		
		//find classes from a package(basePackage)
		ac.scan("com.app.arman");
		//create object 
		ac.refresh();	
		ExcelExport s = ac.getBean("excelExport",ExcelExport.class);	
		System.out.println(s);    */
		
		
		
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(MyAppConfig.class);
		ExcelExport ee = ac.getBean("exObj", ExcelExport.class);
		System.out.println(ee);

		
	}

}
