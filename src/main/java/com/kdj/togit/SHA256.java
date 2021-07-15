package com.kdj.togit;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA256 {
	
	
	public String encrypt(String pw) throws NoSuchAlgorithmException {
		
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			md.update(pw.getBytes());
			
			
			return bytesToHex(md.digest());
		
		
		
	}

	private String bytesToHex(byte[] bytes) {
		// TODO Auto-generated method stub
		StringBuilder builder = new StringBuilder();
		for (byte b : bytes) {
			builder.append(String.format("%02x", b));
			
		}
		return builder.toString();
		
	}

}
