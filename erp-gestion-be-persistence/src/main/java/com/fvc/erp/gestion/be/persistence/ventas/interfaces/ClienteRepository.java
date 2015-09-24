package com.fvc.erp.gestion.be.persistence.ventas.interfaces;

import java.util.List;

import com.fvc.erp.gestion.be.persistence.ventas.vo.ClienteVO;

public interface ClienteRepository {
	
	public List<ClienteVO> getClienteList(ClienteVO clienteVO);

}
