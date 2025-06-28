package com.app.arman.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("esobj")
public class EmployeeService {

	@Autowired
	private EmployeeDao dao;

	@Override
	public String toString() {
		return "EmployeeService [dao=" + dao + "]";
	}

}
