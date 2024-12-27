package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/view")
@Controller
public class ViewController {

	@RequestMapping(value = "/page1")
	public String page1() {
		return "page1";
	}
	
	@PostMapping(value = "/page2")
	public String page2() {
		return "page2";
	}
	
	@GetMapping(value = "/page3")
	public String page3() {
		return "page3";
	}
	
	
}
