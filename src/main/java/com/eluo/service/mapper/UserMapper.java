package com.eluo.service.mapper;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.eluo.model.User;

@Mapper
@Repository
public interface UserMapper {
	
	List<User> selectListUser();
	Optional<User> selectByUserId(String userid);
	void insertUser(User user);

}
