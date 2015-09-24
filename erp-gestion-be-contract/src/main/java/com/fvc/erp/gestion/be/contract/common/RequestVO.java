package com.fvc.erp.gestion.be.contract.common;

public class RequestVO {

	private Object data;
	private PageRequestRestVO pageRequest;
	private int idPerfil;
	
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public PageRequestRestVO getPageRequest() {
		return pageRequest;
	}
	public void setPageRequest(PageRequestRestVO pageRequest) {
		this.pageRequest = pageRequest;
	}
	public int getIdPerfil() {
		return idPerfil;
	}
	public void setIdPerfil(int idPerfil) {
		this.idPerfil = idPerfil;
	}
	
}
