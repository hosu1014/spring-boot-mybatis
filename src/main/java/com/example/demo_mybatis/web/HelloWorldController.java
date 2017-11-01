package com.example.demo_mybatis.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping("/hello.do")
	public String sayHello(Model model) {
		
		logger.debug("HellowWorld");
		return "hello";
	}
}
