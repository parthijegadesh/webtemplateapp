package com.webtemplate.app.dao.impl.repositories;

import org.springframework.data.repository.CrudRepository;

import com.webtemplate.app.dao.entity.User;

public interface UserJPARepository extends CrudRepository<User, Long> {

	public User findByUserNameAndPassword(String userName, String password);

}
