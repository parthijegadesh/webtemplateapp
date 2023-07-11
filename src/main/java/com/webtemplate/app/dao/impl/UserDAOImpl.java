package com.webtemplate.app.dao.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webtemplate.app.dao.UserDAO;
import com.webtemplate.app.dao.entity.User;
import com.webtemplate.app.dao.impl.repositories.UserJPARepository;
import com.webtemplate.app.lombokmapper.UserMapper;
import com.webtemplate.app.vo.UserVO;

@Service
public class UserDAOImpl implements UserDAO {

	@Autowired
	UserJPARepository userJPARepository;

	@Override
	public UserVO save(User user) {
		user = userJPARepository.save(user);
		UserVO userVO = UserMapper.USER_MAPPER_INSTANCE.convertEntityToVO(user);
		return userVO;
	}

	@Override
	public UserVO fetch(Long userId) {
		Optional<User> user = userJPARepository.findById(userId);
		UserVO userVO = UserMapper.USER_MAPPER_INSTANCE.convertEntityToVO(user.get());
		return userVO;
	}

	@Override
	public UserVO fetch(String userName, String password) {
		User user = userJPARepository.findByUserNameAndPassword(userName, password);
		UserVO userVO = UserMapper.USER_MAPPER_INSTANCE.convertEntityToVO(user);
		return userVO;
	}

}
