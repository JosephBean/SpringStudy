package com.java.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import jakarta.servlet.http.Cookie;

@Controller
public class TestController {

//	@GetMapping("/")
//	public String home(@RequestHeader(name = "host") String host) {
//		System.out.println(host);
//		return "home";
//	}
	
	@GetMapping("/")
	public String home(@CookieValue(name="b", required = false) Integer a ) {
		System.out.println(a);
		return "home";
	}
	
}
