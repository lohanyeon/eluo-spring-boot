package com.eluo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.eluo.model.User;
import com.eluo.service.mapper.UserMapper;

@SpringBootTest
@RunWith(SpringRunner.class)
@Transactional
public class UserServiceTest {
	
	@Autowired
	UserMapper userMapper;
	
	@Test
	public void selectListUser() {
		List<User> list = userMapper.selectListUser();
		for (User user : list) {
			System.out.println("=====> " + user.getUserid());
		}
	}

}
