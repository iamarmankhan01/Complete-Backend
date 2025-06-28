package com.app.arman.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Vendor {

	@Value("V1-XYZ")
	private String vname;
}
