package com.kdj.togit;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DAO {
	
	@Autowired
	 private SqlSession ss;
	

	public void insertText(HttpServletRequest request) {
		// TODO Auto-generated method stub
		String text = request.getParameter("text");
		
		MyMapper mm = ss.getMapper(MyMapper.class);
		List<Text> list = mm.showText();
		//mm이 인터페이스에서 온다.
		
		request.setAttribute("list", list);
		
	}

}
