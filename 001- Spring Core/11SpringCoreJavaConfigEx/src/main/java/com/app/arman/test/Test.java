package com.app.arman.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.arman.bean.PdfExport;
import com.app.arman.config.AppConfig;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		PdfExport pe = ac.getBean("pobj",PdfExport.class);
		System.out.println(pe);
	}


}
