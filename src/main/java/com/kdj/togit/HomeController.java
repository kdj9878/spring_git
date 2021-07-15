package com.kdj.togit;

import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	
	


	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		
		
		return "home";
	}
	
	@RequestMapping(value = "/create.pw", method = RequestMethod.GET)
	public String createPw(HttpServletRequest request) throws NoSuchAlgorithmException {
		Create.createpw(request);
		
		
		return "home";
	}
	
}
