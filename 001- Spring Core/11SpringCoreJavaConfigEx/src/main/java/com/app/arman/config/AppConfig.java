package com.app.arman.config;

import org.springframework.context.annotation.Bean;

import com.app.arman.bean.PdfExport;

public class AppConfig {
	@Bean
	public PdfExport pobj() {
		PdfExport p = new PdfExport();
		
		
		p.setFileName("SBMS");
		p.setFileAuth("Arman");
		return p;
	}


}
