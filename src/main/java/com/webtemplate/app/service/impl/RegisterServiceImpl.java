package com.webtemplate.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.webtemplate.app.dao.UserDAO;
import com.webtemplate.app.dao.entity.User;
import com.webtemplate.app.lombokmapper.UserMapper;
import com.webtemplate.app.service.RegisterService;
import com.webtemplate.app.vo.UserVO;

@Component("registerServiceImpl")
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	UserDAO userDAO;

	@Override
	public void save(UserVO userVO) {
		User user = UserMapper.USER_MAPPER_INSTANCE.convertVOToEntity(userVO);
		userDAO.save(user);
	}

}
