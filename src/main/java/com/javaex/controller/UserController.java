package com.javaex.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaex.service.UserService;
import com.javaex.vo.UserVo;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	//로그인
	@RequestMapping(value="/user/login", method= {RequestMethod.GET, RequestMethod.POST})
	public String login(@ModelAttribute UserVo userVo, HttpSession session) {
		System.out.println("UserController.login()");
		System.out.println(userVo);
		
		UserVo authUser = userService.exeLogin(userVo);
		
		if(authUser != null) {
			session.setAttribute("authUser", authUser);
			return "redirect:/main";
		} else {
			System.out.println("로그인 실패");
			return "redirect:/user/loginform";
		}
	
	}
	
	//로그인 폼
	@RequestMapping(value="/user/loginform", method= {RequestMethod.GET, RequestMethod.POST})
	public String loginForm() {
		System.out.println("UserController.loginForm()");
		
		return "/user/loginForm";
	}
	
	//회원가입
	@RequestMapping(value="/user/join", method= {RequestMethod.GET, RequestMethod.POST})
	public String join(@ModelAttribute UserVo userVo) {
		System.out.println("UserController.join()");
		System.out.println(userVo);
		
		userService.exeJoin(userVo);
		
		return "/user/joinOk";
	}
	
	
	//회원가입 폼
	@RequestMapping(value="/user/joinform", method= {RequestMethod.GET, RequestMethod.POST})
	public String joinForm() {
		System.out.println("UserController.joinForm()");
		
		return "/user/joinForm";
	}
	
	//수정
	@RequestMapping(value="/user/modify", method= {RequestMethod.GET, RequestMethod.POST})
	public String modify(@ModelAttribute UserVo userVo, HttpSession session) {
		System.out.println("UserController.modify()");
		
		userService.exeModify(userVo);
		System.out.println(userVo);
	
		// 세션에 수정된 사용자 정보 업데이트
		session.setAttribute("authUser", userVo);
		
		return "redirect:/main";
	}
	
	
	//수정폼
	@RequestMapping(value="/user/modifyform", method= {RequestMethod.GET, RequestMethod.POST})
	public String modifyForm() {
		System.out.println("UserController.modifyForm()");
		
		return "/user/modifyForm";
	}
	
	//로그아웃
	@RequestMapping(value="/user/logout", method= {RequestMethod.GET, RequestMethod.POST})
	public String logout(HttpSession session) {
		System.out.println("UserController.logout()");
		
		session.invalidate();
		
		return "redirect:/main";
	}
	
}
