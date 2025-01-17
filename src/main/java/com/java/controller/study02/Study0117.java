package com.java.controller.study02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.java.dto.Member;
import com.java.mapper.MemberMapper;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/s2")
public class Study0117 {
	
	@Autowired
	private MemberMapper memberMapper;

	public String home(Model model, HttpServletRequest req) {
		String id = req.getParameter("user_id");
		String pw = req.getParameter("user_pw");
		log.info("id = {}, pw = {}", id, pw);
		return "study02/index";
	}
	
	@GetMapping("")
	public String home(
//			Model model,
			HttpSession session,
			@RequestParam(required = false, name = "user_id") String id,
			@RequestParam(required = false, name = "user_pw") String pw
			) {
		log.info("id = {}, pw = {}", id, pw);
		Member member = memberMapper.findByIdAndPwd(
							Member.builder()
								.id(id)
								.pwd(pw)
								.build());
		log.info("Member : {}", member);
		if(member != null) {
			session.setAttribute("msg", member.getName() + "님 어서오세요!");			
//		} else {
//			session.setAttribute("msg", "입력이 잘 못 되었습니다.");			
		}
//		if(id.equals("admin")) {
//			if(pw.equals("1234")) {
//				model.addAttribute("msg", "관리자님 오랜만?");
//				session.setAttribute("msg", "관리자님 오랜만?");
//			}
//		}
		return "study02/index";
	}
	
	@GetMapping("/test")
	public String test() {
		return "study02/test";
	}
	
	@GetMapping("/delete")
	public String delete(HttpSession session) {
		session.invalidate();
		return "redirect:/s2";
	}
	
}
