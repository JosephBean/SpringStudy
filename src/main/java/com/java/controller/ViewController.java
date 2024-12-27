package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/view")
@Controller
public class ViewController {

	@RequestMapping(value = "/page1")
	public String page1() {
		return "page1";
	}
	
	@PostMapping(value = "/page2/{test}")
	public String page2(@PathVariable(name = "test") int name) {
		System.out.println(name);
		return "page2";
	}
	
	@GetMapping(value = {"/page3/{age:[0-9]+}", "/page3"})
	public String page3(@PathVariable(name = "age", required = false) Integer name) {
		System.out.println(name);
		return "page3";
	}
	
}
