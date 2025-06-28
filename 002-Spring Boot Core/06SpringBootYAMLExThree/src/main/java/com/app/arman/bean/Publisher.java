package com.app.arman.bean;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
public class Publisher {

	private Integer pid;
	private String pcode;
	private Boolean active;


}
