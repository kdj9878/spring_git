package com.kdj.togit2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Pro_Controller {
	
	@RequestMapping(value = "secondPage")
	public String home2() {
		
		
		return "home2";
	}
	

}
