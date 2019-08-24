package com.eluo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eluo.model.Account;
import com.eluo.service.repository.AccountRepository;

/**
 * JPA 테스트
 * @author ELUO
 *
 */
@RestController
public class AccountController extends BaseController {
	
	@Autowired
	AccountRepository accountRepository;
	
	@RequestMapping(value="account")
	public String account(Model model) throws Exception {
		
		Account account = new Account();
		account.setUsername("lohanyeon");
		account.setPassword("1111");
		
		Account newAccount = accountRepository.save(account);
		
		logger.info("=============================");
		logger.info(""+newAccount);
		
		return "account";
	}
	
}
