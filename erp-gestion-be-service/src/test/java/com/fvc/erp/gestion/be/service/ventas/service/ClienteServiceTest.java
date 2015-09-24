package com.fvc.erp.gestion.be.service.ventas.service;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.fvc.erp.gestion.be.service.utils.MainServiceTest;
import com.fvc.erp.gestion.be.service.ventas.interfaces.ClienteService;
import com.fvc.erp.gestion.be.service.ventas.vo.ClienteServiceVO;

public class ClienteServiceTest  extends MainServiceTest{

	@Autowired
	ClienteService clienteService;
	
	@Before
	public void setup() {
		
	}
	@Test
	public void test01_getClienteList() {
		
		ClienteServiceVO clienteServiceVO = new ClienteServiceVO();
		List<ClienteServiceVO> clienteServiceList =  clienteService.getClienteList(clienteServiceVO);
		
		assertThat(clienteServiceList.isEmpty(), is(false) );		
		
	}
	
}
