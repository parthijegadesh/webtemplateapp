package com.webtemplate.app.service;

import org.springframework.stereotype.Service;

@Service
public interface LoginService {

	public boolean validateLoginCredential(String userName, String password);

}
