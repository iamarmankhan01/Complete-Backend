package com.app.arman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller 
public class HomeController {

	/**
	 * If request contains URL that ends with /show 
	 * and is of type GET, then the Front Controller (DispatcherServlet)
	 * will call this method and return the view name "Home".
	 */
	@RequestMapping(value = "/show", method = RequestMethod.GET)
	public String showHome() {
		return "Home";
	}
}
