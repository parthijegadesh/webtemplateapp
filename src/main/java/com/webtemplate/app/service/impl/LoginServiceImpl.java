package com.webtemplate.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.webtemplate.app.dao.UserDAO;
import com.webtemplate.app.service.LoginService;
import com.webtemplate.app.vo.UserVO;

@Component("loginServiceImpl")
public class LoginServiceImpl implements LoginService {

	@Autowired
	UserDAO userDAO;

	@Override
	public boolean validateLoginCredential(String userName, String password) {
		UserVO userVO = userDAO.fetch(userName, password);
		return (userVO != null);
	}

}
