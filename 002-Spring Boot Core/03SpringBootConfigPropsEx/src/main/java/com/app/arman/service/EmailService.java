package com.app.arman.service;

import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "my.app")
public class EmailService {

	private String host;
	private int port;
	private String username;
	private boolean active;

	//=============COLLECTION============
	//private List<String> models;
	private Set<String> models;
	//private String[] models;
	
	private Map<String,String> data;
	//private Properties data;
	
	
	private Message mob;//Ref variable



}
