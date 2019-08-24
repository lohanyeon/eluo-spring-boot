package com.eluo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController extends BaseController {
	

	
	@GetMapping("/home/index")
	public String index() {
		logger.info("called /home/index");
		logger.info("called /home/index");
		logger.info("called /home/index");
		logger.info("called /home/index");
		logger.info("called /home/index");
		logger.debug("called debug /home/index");
		
		return "home/index";
	}
	
	@GetMapping("/home/hello")
	public String hello() throws Exception {
		logger.info("called /home/hello");
		logger.info("called /home/hello");
		logger.info("called /home/hello");
		logger.info("called /home/hello");
		logger.info("called /home/hello");
		logger.debug("called debug /home/hello");
		
		/*
		 * boolean t = true; if (t) throw new Exception("occurd error!");
		 */
		
		return "home/hello";
	}
	
	@GetMapping("/home/mypage")
	public String mypage() {
		logger.info("called /home/mypage");
		logger.info("called /home/mypage");
		logger.info("called /home/mypage");
		logger.info("called /home/mypage");
		logger.info("called /home/mypage");
		logger.debug("called debug /home/mypage");
		return "home/mypage";
	}

}
