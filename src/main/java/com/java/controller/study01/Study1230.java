package com.java.controller.study01;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Study1230 {

	@PostMapping("/input.html")
	public String input(@RequestParam Map<String, String> map, Model model) {
		System.out.println(map);
		model.addAttribute("result", map);
		return "1230/input";
	}
	
}
