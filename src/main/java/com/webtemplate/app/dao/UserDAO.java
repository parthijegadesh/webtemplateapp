package com.webtemplate.app.dao;

import com.webtemplate.app.dao.entity.User;
import com.webtemplate.app.vo.UserVO;

public interface UserDAO {

	public UserVO save(User user);

	public UserVO fetch(Long userId);

	public UserVO fetch(String userName, String password);
}
