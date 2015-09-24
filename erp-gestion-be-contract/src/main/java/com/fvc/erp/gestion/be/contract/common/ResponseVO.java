package com.fvc.erp.gestion.be.contract.common;

public class ResponseVO {
	
	private boolean success;
	private String message;
	private Object data;
	private String errorCode;
	private String ReturnCode;
	private String subReturnCode;
	private String routineName;
	private String errorDescription;
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getReturnCode() {
		return ReturnCode;
	}
	public void setReturnCode(String returnCode) {
		ReturnCode = returnCode;
	}
	public String getSubReturnCode() {
		return subReturnCode;
	}
	public void setSubReturnCode(String subReturnCode) {
		this.subReturnCode = subReturnCode;
	}
	public String getRoutineName() {
		return routineName;
	}
	public void setRoutineName(String routineName) {
		this.routineName = routineName;
	}
	public String getErrorDescription() {
		return errorDescription;
	}
	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}
}
