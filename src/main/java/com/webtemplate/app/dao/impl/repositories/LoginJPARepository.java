package com.webtemplate.app.dao.impl.repositories;

import org.springframework.data.repository.CrudRepository;

import com.webtemplate.app.dao.entity.Login;

public interface LoginJPARepository extends CrudRepository<Login, Long> {

}
