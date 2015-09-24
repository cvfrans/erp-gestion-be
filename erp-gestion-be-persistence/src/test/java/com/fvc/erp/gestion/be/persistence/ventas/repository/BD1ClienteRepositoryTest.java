package com.fvc.erp.gestion.be.persistence.ventas.repository;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.fvc.erp.gestion.be.persistence.utils.MainPersistenceTest;
import com.fvc.erp.gestion.be.persistence.ventas.vo.ClienteVO;

public class BD1ClienteRepositoryTest extends MainPersistenceTest {
	
	@Autowired
	BD1ClienteRepository bd1ClienteRepository;
	
	@Test
	public void test01_getClienteList() {
		
		ClienteVO clienteVO = new ClienteVO();
		
		List<ClienteVO> clienteListVO = bd1ClienteRepository.getClienteList(clienteVO);
		
		assertThat(clienteListVO.isEmpty(), is(false) );
	}

}
