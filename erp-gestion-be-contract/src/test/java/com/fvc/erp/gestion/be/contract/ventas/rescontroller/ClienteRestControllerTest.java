package com.fvc.erp.gestion.be.contract.ventas.rescontroller;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static com.fvc.erp.gestion.be.contract.common.ConverterRestUtils.convertObjectToJsonBytes;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fvc.erp.gestion.be.common.Constants;
import com.fvc.erp.gestion.be.contract.common.PageRequestRestVO;
import com.fvc.erp.gestion.be.contract.common.RequestVO;
import com.fvc.erp.gestion.be.contract.config.MainContractTest;

public class ClienteRestControllerTest extends MainContractTest {
	
	private MockMvc mockMvc;
	 
	@Autowired
	private WebApplicationContext ctx;
	
	private RequestVO requestVO;
	
	@Before
	public void setUp() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
		
		requestVO = new RequestVO();
	}
	
	@Test
	public void test01_OK_listCliente() throws Exception {
		
		
		PageRequestRestVO pageRequestRestVO = new PageRequestRestVO();
		pageRequestRestVO.setPageNumber(0);
		pageRequestRestVO.setPageSize(10);

		requestVO.setPageRequest(pageRequestRestVO);
		
		mockMvc.perform(
				post("/cliente/listarCliente").contentType(
						MediaType.APPLICATION_JSON_VALUE)
						.content(convertObjectToJsonBytes(requestVO))).andExpect(status().isOk())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
				.andExpect(jsonPath("$.success", is(true)))
				.andExpect(jsonPath("$.message", is(Constants.MESSAGE_SUCCESS))).andDo(print());
		
	}

}
