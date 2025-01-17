package com.java.controller.study02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/s2")
public class Study0117 {

	@GetMapping("")
	public String home() {
		return "study02/index";
	}
	
}
