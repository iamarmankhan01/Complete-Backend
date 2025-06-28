package com.app.arman.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sdao")
public class StudentDao {
	@Value("Arman Khan ")
 private String sname;

	@Override
	public String toString() {
		return "StudentDao [sname=" + sname + "]";
	}
	
}
