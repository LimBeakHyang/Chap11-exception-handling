package com.springboot.controller;

import java.nio.file.attribute.UserPrincipalNotFoundException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Example02Controller {

	@GetMapping("/exam02")
	public void requestMethod() throws Exception {
		 throw new Exception(new UserException("UserException 메시지입니다"));
		   // UserException.java 메시지 노출
		  
		 
		//throw new UserException("UserException 메시지입니다"); // UserException.java 연동되서 메시지 노출
	}
}
