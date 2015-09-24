package com.fvc.erp.gestion.be.service.ventas.interfaces;

import java.util.List;

import com.fvc.erp.gestion.be.service.ventas.vo.ClienteServiceVO;


public interface ClienteService {
	
	public List<ClienteServiceVO> getClienteList(ClienteServiceVO clienteServiceVO);	
	
}
