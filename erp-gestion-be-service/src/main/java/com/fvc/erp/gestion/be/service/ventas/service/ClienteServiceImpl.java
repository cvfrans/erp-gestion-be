package com.fvc.erp.gestion.be.service.ventas.service;

import static com.fvc.erp.gestion.be.common.ConversorUtils.convertToList;
import static com.fvc.erp.gestion.be.common.ConversorUtils.convertToObject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fvc.erp.gestion.be.persistence.ventas.interfaces.ClienteRepository;
import com.fvc.erp.gestion.be.persistence.ventas.vo.ClienteVO;
import com.fvc.erp.gestion.be.service.ventas.interfaces.ClienteService;
import com.fvc.erp.gestion.be.service.ventas.vo.ClienteServiceVO;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	ClienteRepository clienteRepository;
	
	@Override
	public List<ClienteServiceVO> getClienteList(ClienteServiceVO clienteServiceVO) {		
		
		List<ClienteServiceVO> clienteServiceList = convertToList( 
									clienteRepository.getClienteList(  convertToObject(clienteServiceVO, ClienteVO.class) ),
									ClienteServiceVO.class	); 
		return clienteServiceList;
	}

}
