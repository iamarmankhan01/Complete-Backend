package com.app.arman.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties("my.app.db")
public class MyDbCon {
	private String driver;
	private String url;
	private String username;
	private String password;
	private String database;

}
