package com.webtemplate.app.service;

import org.springframework.stereotype.Service;

import com.webtemplate.app.vo.UserVO;

@Service
public interface RegisterService {

	public void save(UserVO userVO);
}
