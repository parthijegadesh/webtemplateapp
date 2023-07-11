package com.webtemplate.app.lombokmapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import com.webtemplate.app.dao.entity.User;
import com.webtemplate.app.vo.UserVO;

@Component
@Mapper
public interface UserMapper {
	
	UserMapper USER_MAPPER_INSTANCE = Mappers.getMapper(UserMapper.class);

	UserVO convertEntityToVO(User user);

	User convertVOToEntity(UserVO userVO);
}
