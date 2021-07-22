package com.kdj.togit;

import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


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
	@ResponseBody
	public String test(HttpServletRequest request, Text t) {
		dao.insertText(request, t);
		dao.showText(request);
		
		
		
		
		return "home";
	}
	
	@RequestMapping(value = "/toResult2", method = RequestMethod.POST)
	@ResponseBody
	public HashMap<String, Object> test2(HttpServletRequest request, Text t){
		HashMap<String, Object> result = new HashMap<String, Object>();
		
		
		if (dao.insertText(request, t)>0) {
			List<Text> text = dao.showText(request);
			for (Text t2 : text) {
				System.out.println(t2.getT_text());
			}
			
			
			String Msg = "성공";
			String Code = "0";
			result.put("Msg", Msg);
			result.put("Code", Code);
			result.put("Text", text);
			
			return result;
		}
		else {
			String Msg = "실패";
			String Code = "1";
			result.put("Msg", Msg);
			result.put("Code", Code);
			
			return result;
		}
	}
	
	
}
