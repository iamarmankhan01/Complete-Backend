package com.app.arman.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan("com.app.arman")
@PropertySource("classpath:myapp.properties")
public class AppConfig {

}
