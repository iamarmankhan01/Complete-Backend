package com.app.arman.bean;

import java.util.Random;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.ToString;

@ToString
@Component("tok") 
@Scope("prototype")
public class Token {
	private int token;

	public Token() {
		super();
		token = new Random().nextInt(9999);
		System.out.println("TOKEN IS CREATED");
	}

}
