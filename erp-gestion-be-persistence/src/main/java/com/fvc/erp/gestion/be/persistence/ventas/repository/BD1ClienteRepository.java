package com.fvc.erp.gestion.be.persistence.ventas.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.fvc.erp.gestion.be.persistence.ventas.interfaces.ClienteRepository;
import com.fvc.erp.gestion.be.persistence.ventas.vo.ClienteVO;

@Repository
public class BD1ClienteRepository implements ClienteRepository{

	@Override
	public List<ClienteVO> getClienteList(ClienteVO clienteVO) {
		
		List<ClienteVO> clienteListVO  = new ArrayList<>();
		ClienteVO clienteVO1 = new ClienteVO();
		ClienteVO clienteVO2 = new ClienteVO();
		ClienteVO clienteVO3 = new ClienteVO();
		clienteVO1.setIdCliente("C001");
		clienteVO1.setNombre("Frans");
		clienteVO1.setApePaterno("Valdivia");
		clienteVO1.setApePaterno("Chavez");
		
		clienteVO2.setIdCliente("C002");
		clienteVO2.setNombre("Juan");
		clienteVO2.setApePaterno("Clemente");
		clienteVO2.setApePaterno("Araoz");
		
		clienteVO3.setIdCliente("C00");
		clienteVO3.setNombre("Milagros");
		clienteVO3.setApePaterno("Castillo");
		clienteVO3.setApePaterno("De Paz");
		
		clienteListVO.add(clienteVO1);
		clienteListVO.add(clienteVO2);
		clienteListVO.add(clienteVO3);
		
		return clienteListVO;
	}

}
