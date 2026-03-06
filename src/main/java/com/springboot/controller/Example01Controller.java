package com.springboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class Example01Controller {
	@ResponseStatus(value=HttpStatus.BAD_REQUEST, reason="요청 실패했습니다.")
	@GetMapping("/exam01")
	public void rquestMethod() {
		System.out.print(new IllegalArgumentException("요청 실패했습니다.").getMessage());
	}

}
