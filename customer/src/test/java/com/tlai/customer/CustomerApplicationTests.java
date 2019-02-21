package com.tlai.customer;

import com.tlai.CustomerApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = CustomerApplication.class)
@SpringBootTest
public class CustomerApplicationTests {

	@Autowired
	private WebApplicationContext wac;

	private MockMvc mvc;

	@Before
	public void init() {
		this.mvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}


	@Test
	public void dubboTest() throws Exception {
		this.mvc.perform(get("/dubbo")
				//.param("text", "").param("summary", ""))
				)
				.andDo(MockMvcResultHandlers.print())
				.andReturn();
//				.andExpect(status().isOk())
//				.andExpect(content().string(containsString("is required")));
	}


//	@Test
//	public void testCreateValidation() throws Exception {
//		this.mockMvc.perform(post("/").param("text", "").param("summary", ""))
//				.andExpect(status().isOk())
//				.andExpect(content().string(containsString("is required")));
//	}

}
