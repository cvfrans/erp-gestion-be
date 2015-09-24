package com.fvc.erp.gestion.be.contract.ventas.rescontroller;

import static com.fvc.erp.gestion.be.common.ConversorUtils.convertToList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fvc.erp.gestion.be.contract.common.RequestVO;
import com.fvc.erp.gestion.be.contract.common.ResponseVO;
import com.fvc.erp.gestion.be.contract.ventas.vo.ClienteRestVO;
import com.fvc.erp.gestion.be.service.ventas.interfaces.ClienteService;
import com.fvc.erp.gestion.be.service.ventas.vo.ClienteServiceVO;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/cliente")
public class ClienteRestController {
	
	@Autowired
	ClienteService clienteService;
	
	@ApiOperation( value = "Obtiene una lista de clientes", notes = "Obtiene una lista de clientes de gestión")
    @RequestMapping(value = "/listarCliente", method = RequestMethod.POST , produces = MediaType.APPLICATION_JSON_VALUE , consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseVO listCliente(@RequestBody RequestVO requestVO) {
		
		ClienteServiceVO clienteServiceVO = new ClienteServiceVO();
		
		List<ClienteRestVO> clienteRestList = convertToList(
							clienteService.getClienteList(clienteServiceVO),
							ClienteRestVO.class);
		
		ResponseVO responseVO = new ResponseVO();
		responseVO.setData(clienteRestList);
		
		return responseVO;
	}
	
	@ApiOperation( value = "Obtiene un cliente de prueba", notes = "Obtiene un cliente de prueba")
	@RequestMapping(value = "/listarPrueba", method = RequestMethod.GET , produces = MediaType.APPLICATION_JSON_VALUE , consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ClienteServiceVO prueba(){
		
		ClienteServiceVO clienteServiceVO = new ClienteServiceVO();
		clienteServiceVO.setIdCliente("C005");
		clienteServiceVO.setNombre("XXXX0001");
		return clienteServiceVO;
	}

}
