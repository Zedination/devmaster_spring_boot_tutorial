package com.example.devmaster;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController
//@Controller
public class DevmasterApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevmasterApplication.class, args);
	}
//	@GetMapping("/login")
//	public String processLogin(HttpServletRequest httpServletRequest) {
//		HttpSession session = httpServletRequest.getSession(false);
//		if(session == null) {
//			return "Bạn chưa đăng nhập!";
//		}
//		return "bạn đã đăng nhập";
//	}
//	
//	@PostMapping("/login")
//	public String doLogin(String username, HttpServletRequest httpServletRequest) {
//		if("anhduc".equals(username)) {
//			httpServletRequest.getSession().setAttribute("username", username);
//			return username;
//		}
//		return "Đăng nhập ko thành công!";
//	}
	
	@Bean(name = "beanDemo")
	public String beanDemo() {
		return "bean demo";
	}
}
