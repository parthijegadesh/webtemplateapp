package com.webtemplate.app.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webtemplate.app.dao.LoginDAO;
import com.webtemplate.app.dao.entity.Login;
import com.webtemplate.app.dao.impl.repositories.LoginJPARepository;

@Service
public class LoginDAOImpl implements LoginDAO {

	@Autowired
	LoginJPARepository loginJPARepository;
	
	@Override
	public void save(Login login) {
		loginJPARepository.save(login);
	}

}
