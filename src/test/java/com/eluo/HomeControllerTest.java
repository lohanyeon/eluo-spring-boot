package com.eluo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.eluo.controller.HomeController;

@RunWith(SpringRunner.class)
@WebMvcTest(HomeController.class)
public class HomeControllerTest {
	
	@Autowired 
	MockMvc mockMvc;
	
	@Test
	@WithMockUser
	public void hello() throws Exception {
		mockMvc.perform(get("/home/hello"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(view().name("home/hello"));
	}
	
	@Test
	@WithMockUser
	public void mypage() throws Exception {
		mockMvc.perform(get("/home/mypage"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(view().name("home/mypage"));
	}

}
