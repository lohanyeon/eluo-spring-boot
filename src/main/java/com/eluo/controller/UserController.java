package com.eluo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eluo.model.Account;
import com.eluo.model.User;
import com.eluo.service.UserService;
import com.eluo.service.mapper.UserMapper;

@Controller
public class UserController extends BaseController {
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value="user")
	public String user(Model model) throws Exception {
		List<User> list = userMapper.selectListUser();
		
		model.addAttribute("list", list);
		return "user";
	}
	
	@GetMapping("user/create")
	@ResponseBody
	public String create(Model model) throws Exception {
		
		userService.createUser("lohanyeon01", "1121");
		
		return "create";
	}

}