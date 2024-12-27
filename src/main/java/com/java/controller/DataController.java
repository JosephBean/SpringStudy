package com.java.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/data")
@RestController
public class DataController {

	@RequestMapping("/test4")
	public String page1() {
		return "page1";
	}
	
	@RequestMapping(path = "/test2")
	public String page2() {
		return "page2";
	}
	
	@RequestMapping(value = "/page3")
	public String page3() {
		return "page3";
	}
	
}
