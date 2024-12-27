package com.java.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/page")
@Controller
public class PageController {
	
	List<String> pages = new ArrayList<>();
	
	public PageController() {
		pages.add("page1");
		pages.add("page2");
		pages.add("page3");
	}

	@GetMapping("/{page}")
	public String page(@PathVariable(name="page") String page) {
		boolean check = false;
		for(String view : pages) {
			if(page.equals(view)) {
				check = true;
				break;
			}
		};
		return check ? "page/" + page : "redirect:/view/page1";
		
//		if(page.equals("page1") || page.equals("page2") || page.equals("page3")) {
//			return "page/" + page;
//		} else {
//			return "redirect:/view/page1";
//		}
	}
	
}
