package com.kdj.togit;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class DAO {
	
	@Autowired
	 private SqlSession ss;
	

	public int insertText(HttpServletRequest request, Text t) {
		// TODO Auto-generated method stub
		
		
		
		MyMapper mm = ss.getMapper(MyMapper.class);
		
			
			
		
		
		return mm.insertText(t);
		
	}
	
	@ResponseBody
	public List<Text> showText(HttpServletRequest request) {
		MyMapper mm = ss.getMapper(MyMapper.class);
		List<Text> list = mm.showText();
		
		request.setAttribute("list", list);
			
		
		return list;
	}

	
}
