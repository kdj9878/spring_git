package com.kdj.togit;

import java.security.NoSuchAlgorithmException;
import org.codehaus.jackson.*;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	
	@Autowired
	private DAO dao;


	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		
		
		return "home";
	}
	
	@RequestMapping(value = "/create.pw", method = RequestMethod.GET)
	public String createPw(HttpServletRequest request) throws NoSuchAlgorithmException {
		Create.createpw(request);
		
		
		return "home";
	}
	
	@RequestMapping(value = "/toResult", method = RequestMethod.POST)
	public String test(HttpServletRequest request, Text t) {
		dao.insertText(request, t);
		dao.showText(request);
		
		
		
		
		return "home";
	}
	
	
	
}
