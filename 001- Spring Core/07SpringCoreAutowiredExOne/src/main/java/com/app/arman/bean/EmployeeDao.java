package com.app.arman.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("edao")
public class EmployeeDao {

	@Value("ArmanKhan")
	private String dbName;

	@Override
	public String toString() {
		return "EmployeeDao [dbName=" + dbName + "]";
	}

}
