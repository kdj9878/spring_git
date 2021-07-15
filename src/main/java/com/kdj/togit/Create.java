package com.kdj.togit;

import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpServletRequest;

public class Create {

	public static void createpw(HttpServletRequest request) throws NoSuchAlgorithmException {
		// TODO Auto-generated method stub
		String pw = request.getParameter("pw");
		SHA256 sha256 = new SHA256();
		String crypto_pw = sha256.encrypt(pw);
		
		request.setAttribute("crypto_pw", crypto_pw);
		
		
		
		
		
	}
		

}
